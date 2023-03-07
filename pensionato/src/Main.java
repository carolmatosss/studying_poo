import entities.Registry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pensoes serao registradas: ");
        int n = sc.nextInt();
        int total = 9;
        Registry[] registries = new Registry[total];

        for (int i = 0; i < n; i++) {

            System.out.println("Registry #" + (i + 1));
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Email:");
            String email = sc.next();
            System.out.println("Room:");
            int room = sc.nextInt();
            registries[room] = new Registry(name, email, room);

        }

        for (int j = 0; j < total; j++) {
            if (registries[j] != null) {
                System.out.println(registries[j]);
            }
        }
    }
}