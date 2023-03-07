package main;

import entities.Height;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people are being insert: ");
        int n = sc.nextInt();
        double total = 0, media = 0, porcentagem = 0;
        int soma = 0;
        //Array de referencia (Aramzena referencia de posicao)
        Height[] array = new Height[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data  " + (i + 1) + "ª person: ");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            //Precisa instanciar o objeto e a caixinha posicao ira referenciar o objeto
            array[i] = new Height(name, age, height);
            total += array[i].getHeight();
        }
        media = total / n;
        System.out.printf("Media: %.2f", media);

        for (Height vect : array) {

            System.out.println("Pessoas com menos de 16 anos: ");
            if (vect.getAge() < 16) {
                soma++;
                System.out.println(vect.getName());
            }

        }

        porcentagem = (soma * 100) / n;
        System.out.println("Porcentagem: " + porcentagem + " %");


    }
}
