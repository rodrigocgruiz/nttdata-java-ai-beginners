package fundamentalsjava.controlstructures;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

            System.out.println("Por favor, informe seu peso (kg): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, informe um número para o peso.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }
            double peso = scanner.nextDouble();

            System.out.println("Por favor, informe sua altura: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Valor inválido! Por favor, informe um número para a altura.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }
            double altura = scanner.nextDouble();

            scanner.nextLine();

            double imc = peso / (altura * altura);

            if (imc <= 18.5) {
                System.out.println("Abaixo do peso!");
            } else if (imc > 18.6 && imc <= 24.9) {
                System.out.println("Peso normal!");
            } else if (imc > 25.0 && imc <= 29.9) {
                System.out.println("Sobrepeso!");
            } else if (imc > 30.0 && imc <= 34.9) {
                System.out.println("Obesidade grau I!");
            } else if (imc > 35.0 && imc <= 39.9) {
                System.out.println("Obesidade grau II!");
            } else {
                System.out.println("Obesidade grau III!");
            }

            System.out.println("Deseja fazer nova consulta? Digite E para continuar ou S para sair: )");
            String repeat = scanner.nextLine();

            if (repeat.equalsIgnoreCase("E")) {
                continue;
            }
            if (repeat.equalsIgnoreCase("S")){
                break;
            }else{
                System.out.println("Opção inválida! Por favor, informe E para entrar ou S para sair.");
            }
        }
        System.out.println("Obrigado por usar a calculadora de IMC!");
        scanner.close();
    }
}
