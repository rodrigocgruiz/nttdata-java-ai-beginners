package fundamentalsjava.controlstructures;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de tabuadas!");
        System.out.println("Digite E para entrar no sistema e S para sair: ");
        String option = scanner.nextLine();

        while (true) {


            if (option.equalsIgnoreCase("S")) {
                System.out.println("Obrigado por usar o sistema de tabuadas!");
                break;
            }

            if (!option.equalsIgnoreCase("s") && !option.equalsIgnoreCase("e")) {
                System.out.println("Opção inválida! Por favor, informe S para sim ou N para não.");
                continue;
            }

            System.out.println("Por favor, informe um número referente a tabuada: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < 10; i++) {
                System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1)));
            }

            System.out.println("Deseja fazer nova consulta? Digite E para continuar ou S para sair: )");
            String repeat = scanner.nextLine();

            if (!repeat.equalsIgnoreCase("E") && !repeat.equalsIgnoreCase("S")){
                System.out.println("Opção inválida! Por favor, informe E para entrar ou S para sair.");
            }continue;
        }
        System.out.println("Obrigado por usar o sistema de tabuadas!");
    }
}
