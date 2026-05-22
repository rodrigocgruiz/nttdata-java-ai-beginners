package fundamentalsjava;

import java.util.Scanner;

public class ExercicioDoisCorrecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = 0;
        double height = 0;
        double imc;

        String option;

        System.out.println("Digite E para entrar no sistema e S para sair: ");
        option = scanner.nextLine();

        while (!option.equalsIgnoreCase("S") && !option.equalsIgnoreCase("E")) {
            System.out.println("Opção inválida!");
            System.out.println("Digite E para entrar no sistema e S para sair: ");
            option = scanner.nextLine();
        }

        if (option.equalsIgnoreCase("S")) {
            System.out.println("Obrigado por usar a calculadora de IMC!");
            return;
        }

        System.out.println("Bem vindo à sua calculadora de IMC!");


        while (true) {
            System.out.println("Por favor, informe seu peso (kg): ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, informe um número para o peso.");
                scanner.next(); // Limpa a entrada inválida
            }
            weight = scanner.nextDouble();

            if (weight <= 0) {
                System.out.println("Peso deve ser maior que zero.");
                scanner.nextLine();
                continue;
            }

            System.out.println("Por favor, informe sua altura: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, informe um número para a altura.");
                scanner.next(); // Limpa a entrada inválida
            }
            height = scanner.nextDouble();

            if (height <= 0) {
                System.out.println("Altura deve ser maior que zero.");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();

            imc = weight / (height * height);

            if (imc < 18.5) {
                System.out.printf("Abaixo do peso!" + "\nIMC: %.2f", imc);
            } else if (imc < 25) {
                System.out.printf("Peso normal!" + "\nIMC: %.2f", imc);
            } else if (imc < 30.0) {
                System.out.printf("Sobrepeso!" + "\nIMC: %.2f", imc);
            } else if (imc < 35.0) {
                System.out.printf("Obesidade grau I!" + "\nIMC: %.2f", imc);
            } else if (imc < 40.0) {
                System.out.printf("Obesidade grau II!" + "\nIMC: %.2f", imc);
            } else {
                System.out.printf("Obesidade grau III!" + "\nIMC: %.2f", imc);
            }

            String repeat;

            while (true) {
                System.out.println();
                System.out.println("Deseja fazer nova consulta? Digite E para continuar ou S para sair: )");
                repeat = scanner.nextLine();

                if (repeat.equalsIgnoreCase("E")) {
                    break;
                }

                if (repeat.equalsIgnoreCase("S")) {
                    scanner.close();
                    System.out.println("Obrigado por usar a calculadora de IMC!");
                    return;
                }
            }
            System.out.println("\nOpção inválida");
        }
    }
}
