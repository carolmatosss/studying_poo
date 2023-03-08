import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        //Declaracao de lista - nao aceita numeros primitivos
        List<String> list = new ArrayList<>();

        //Adicionar elementos
        list.add("Maria");
        list.add("Alex");
        list.add("Maria");
        list.add("Nathalia");
        list.add("Carol");

        //Inserir elemento em posicao especifica
        list.add(1, "Jose");

        //Tamanho da lita
        System.out.println("Tamanho: " + list.size());

        for (String lista : list) {
            System.out.println(lista);
        }

        //Para remover valor da lista a partir da comparacao entre dados
        list.remove("Carol");

        //Remover itens que atendem a um predicado. Por exemplo remover todos que comecam com a letra N
        list.removeIf(x -> x.charAt(0) == 'N');
        System.out.println("---------------------------");

        for (String x : list) {
            System.out.println(x);
        }

        //Posicao de um elemento especifico
        System.out.println("Posicao do Jose: "+list.indexOf("Jose"));

        /*Criar lista somente elementos especificos, devolvendo nova lista.
        Inicialmente é convertido para stream, para que aceite a expressao lambda, e entao
        é devolvido para list pelo comando Collectors
         */
        List<String > result = list.stream().filter(x -> x.charAt(0)=='M').collect(Collectors.toList());


        for (String x : result) {
            System.out.println(x);
        }

        //Encontrar elementos com predicado
        System.out.println("---------------------------");

        String name = list.stream().filter(x -> x.charAt(0)=='B').findFirst().orElse(null);
        System.out.println(name);

    }
}