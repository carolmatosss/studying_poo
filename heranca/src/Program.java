import entities.Triangle;

import java.util.Scanner;

public class Program {

    //Com a tipagem triangle criada, com os atributos
    //preciso, aqui vamos olhar para a instancia de objetos

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); //Cria a variavel leia do tipo scanner,
        //instancia na classe scanner


        //Para criar uma nova instancia de objeto em triangle temos:
        Triangle x, y; // Cria as variaveis x e y do tipo triangle
        x = new Triangle();
        y = new Triangle();

        //Para ler os atributos basta fazer
        System.out.println("Insira as medidas de x: ");
        x.ladoA = leia.nextDouble();
        x.ladoB = leia.nextDouble();
        x.ladoC = leia.nextDouble();

        System.out.println("\nInsira as medidas de y: ");
        y.ladoA = leia.nextDouble();
        y.ladoB = leia.nextDouble();
        y.ladoC = leia.nextDouble();
//Instanciacao = Alocacao dinamica de memoria
//Variaveis declaradas sao alocadas numa area da memoria chamada stack,
//sao variaveis estaticas. Quando trazemos o new criamos uma alocacao dinamica de memoria
//durante a execucao.
        //Assim quando criamos Triangle x,y estamos criando variaveis no stack, que irao armazenar
        //o endereço das variaveis no heao (dinamico), essas do heap que terao todas as informacoes da tipagem
        // e sao criadas a partir do new triangle

        //-------------------------------------------------------------------------//

        //Agora chamaremos a funcao atraves dos objetos

        double areaX = x.area();
        double areaY = x.area();

        System.out.println("A area de x é:" + areaX + " e a area de Y é: " + areaY);

    }
}
