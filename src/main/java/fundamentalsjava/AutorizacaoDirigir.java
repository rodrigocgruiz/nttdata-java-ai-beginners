package fundamentalsjava;

import java.util.Scanner;

public class AutorizacaoDirigir {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.nextLine();
        System.out.println("informe sua idade: ");
        var age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Você é emancipado? ");
            var emancipated = scanner.next().equalsIgnoreCase("s");
            var message = emancipated ? name + " você pode dirigir.\n" : name + " voce e menor de idade, não pode dirigir.\n";
            System.out.println(message);
        } else {
            System.out.printf("%s, voce e maior de idade, você pode dirigir\n", name);
        }

        System.out.println("Fim de execução!");

    }
}
