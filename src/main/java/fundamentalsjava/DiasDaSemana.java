package fundamentalsjava.controlstructures;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);;

        while (true) {
            int option;

            System.out.println("Informe um número de 1 a 7 ou 0 para sair: ");

            if (!scanner.hasNextInt()){
                System.out.println("Entrada inválida!");
                scanner.next();
                continue;
            }

            option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Saindo...");
                break;
            }

            var message = switch (option){
                case 1,7 -> {
                    var day = option == 1 ? "Domingo" : "Sábado";
                    yield String.format("Hoje é %s, fim de semana!!!", day);
                }
                case 2 -> "Segunda-Feira";
                case 3 -> "Terça-Feira-Feira";
                case 4 -> "Quarta-Feira";
                case 5 -> "Quinta-Feira";
                case 6 -> "Sexta-Feira";
                default -> "Opção inválida";
            };
            System.out.println(message);
        }
    }
}
