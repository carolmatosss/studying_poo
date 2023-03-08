import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas funcionarios deseja adicionar?");
        n = sc.nextInt();
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employe #"+(i+1)+":");
            System.out.println("Id: ");
            //Conferindo se Id existe
            Integer id = sc.nextInt();
            Employee result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (result == null) {
                System.out.println("Nome: ");
                String name = sc.next();
                System.out.println("Salario: ");
                Double salary = sc.nextDouble();

                Employee employee = new Employee();

                employee.setId(id);
                employee.setName(name);
                employee.setSalary(salary);
                list.add(employee);

            } else {
                System.out.println("O id " + id + " já existe");
                i--;
            }
        }

        for (Employee x : list) {
            System.out.println(x);
        }

        // TODO: 08/03/23 Fazer id com mais de dois digitos. 

        System.out.println("Voce deseja aumentar o salario de algum funcionario?");
        System.out.println("1- Sim " + "2- nao");
        int answer = sc.nextInt();
        do {
            System.out.println("Insira o id do funcionario: ");
            Integer id = sc.nextInt();
            Employee employee1 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (employee1 == null) {
                System.out.println("Id nao existe");


            } else {
                System.out.println("Insira o valor de aumento: ");
                double newSalary = sc.nextDouble();
                employee1.addSalary(newSalary);
                for (Employee x : list) {
                    System.out.println(x);

                }
            }

            System.out.println("Voce deseja aumentar o salario de algum funcionario?");
            System.out.println("1- Sim " + "2- nao");
            answer = sc.nextInt();


        } while (answer == 1);

        for (Employee x : list) {
            System.out.println(x);
        }
    }
}