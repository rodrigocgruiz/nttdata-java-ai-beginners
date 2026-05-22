package fundamentalsjava.controlstructures;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
//        while (!name.equalsIgnoreCase("exit")) {
//            System.out.println("Digite seu nome: ");
//            name = scanner.nextLine();
//            System.out.println("Olá " + name);
//        }
//        System.out.println("Fim de execução!");

//        while (true) {
//            System.out.println("Digite seu nome: ");
//            name = scanner.nextLine();
//
//            if (name.equalsIgnoreCase("exit")) break;
//
//            System.out.println("Olá " + name);
//        }
//        System.out.println("Fim de execução!");

        do {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) break;

            System.out.println("Olá " + name);
        }while(true);
        System.out.println("Fim de execução!");

    }
}
