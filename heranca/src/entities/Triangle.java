package entities;

public class Triangle {

    //Cria os membros de uma classe triangulo, neste caso atributos, que caracterizam
    //o triangulo. Public porque estes atributos podem ser acessados por outros
    //arquivos.

    //Fazendo atributos, definindo tipagem
    public double ladoA;
    public double ladoB;
    public double ladoC;

    //Criando um metodo de calculo de area

    //Classe publica, que retorna um double, no parentese coloca-se os parametros
    // a serem recebidos alem daqueles ja declarados. Nao é void precisa retornar algo
    public double area() {
        double p = (ladoA + ladoB + ladoC) / 2.0;
        double result = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));

        return result;
    }

    //Toda classe java é uma subclasse da classe Object que possui os metodos: getClas=
    //retorna o tipo de objeto | equals= compara se o objeto é igual ao outro |
    //hashCode=retorna um codigo hash do objeto | toString=converte um objeto para string.


}

