package fundamentalsjava.controlstructures;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double imc;

        System.out.println("Bem vindo à sua calculadora de IMC!");
        System.out.println("Digite E para entrar no sistema e S para sair: ");
        String option = scanner.nextLine();

        while (true) {

            if (option.equalsIgnoreCase("S")) {
                System.out.println("Obrigado por usar a calculadora de IMC!");
                break;
            }

            if (!option.equalsIgnoreCase("s") && !option.equalsIgnoreCase("e")) {
                System.out.println("Opção inválida! Por favor, informe S para sim ou N para não.");
                continue;
            }

            System.out.println("Por favor, informe seu peso: ");
            double peso = scanner.nextDouble();

            System.out.println("Por favor, informe sua altura: ");
            double altura = scanner.nextDouble();

            imc = peso / (altura * altura);

            if (imc <= 18.5) {
                System.out.println("Abaixo do peso!");
            } else if (imc > 18.5 && imc <= 24.9) {
                System.out.println("Peso normal!");
            } else if (imc > 24.9 && imc <= 29.9) {
                System.out.println("Sobrepeso!");
            } else if (imc > 29.9 && imc <= 34.9) {
                System.out.println("Obesidade grau I!");
            } else if (imc > 34.9 && imc <= 39.9) {
                System.out.println("Obesidade grau II!");
            } else {
                System.out.println("Obesidade grau III!");
            }

            System.out.println("Deseja fazer nova consulta? Digite E para continuar ou S para sair: )");
            String repeat = scanner.nextLine();

            if (!repeat.equalsIgnoreCase("E") && !repeat.equalsIgnoreCase("S")) {
                System.out.println("Opção inválida! Por favor, informe E para entrar ou S para sair.");
            }
            continue;
        }
        System.out.println("Obrigado por usar a calculadora de IMC!");
    }
}
