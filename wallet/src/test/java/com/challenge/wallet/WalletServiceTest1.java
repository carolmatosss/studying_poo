package com.challenge.wallet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletServiceTest1 {


    interface ICarteiraService {
        void depositarDinheiro(String idCarteira, int valorADepositar);

        void transferirDinheiro(String idCarteiraFonte, String idCarteiraDestino, int valorATransferir);
    }

    class CarteiraService implements ICarteiraService {
        HashMap<String, Carteira> bancoDeDadosDeCarteiras = new HashMap<>() {{
            put("carteira-do-tassio", new Carteira("carteira-do-tassio", "Tassio", 100));
            put("carteira-da-carol", new Carteira("carteira-da-carol", "Carol", 1000));
        }};

        Carteira getCarteira(String idCarteira) {
            return bancoDeDadosDeCarteiras.get(idCarteira);
        }

        @Override
        public void depositarDinheiro(String idCarteira, int valorADepositar) {
            var carteiraAReceberDeposito = bancoDeDadosDeCarteiras.get(idCarteira);
            if (carteiraAReceberDeposito == null) throw new RuntimeException("A carteira não existe :(");
            bancoDeDadosDeCarteiras.remove(idCarteira);
            bancoDeDadosDeCarteiras.put(idCarteira, new Carteira(
                    carteiraAReceberDeposito.id(),
                    carteiraAReceberDeposito.nomeDoDono(),
                    carteiraAReceberDeposito.saldo() + valorADepositar
            ));
        }

        @Override
        public void transferirDinheiro(String idCarteiraFonte, String idCarteiraDestino, int valorATransferir) {

        }
    }

    record Carteira(
            String id,
            String nomeDoDono,
            int saldo
    ) {
    }

    ;

    class CarteiraServiceTests {
        @Test
        @DisplayName("Quando eu transfiro R$10 para uma carteira, o saldo final vai ser o saldo de antes + R$10")
        public void transferirSaldoDaCarteira() {
            var carteiraService = new CarteiraService();
            carteiraService.depositarDinheiro("carteira-da-carol", 10);
            var carteiraDaCarol = carteiraService.getCarteira("carteira-da-carol");
            assertEquals(carteiraDaCarol.saldo(), 1010);
        }
    }
}
