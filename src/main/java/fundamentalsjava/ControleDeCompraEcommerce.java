package fundamentalsjava;

import java.util.Scanner;
import java.util.Locale;

public class ControleDeCompraEcommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite o número de compras realizadas:");
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            System.out.println("Digite o valor de cada compra:");
            double totalSpent = 0.0;

            // TODO: Leia os valores das compras e calcule a média
            for (int i = 0; i < purchaseCount; i++) {
                totalSpent += scanner.nextDouble();
            }

            double average = totalSpent / purchaseCount;

            System.out.printf("Valor total das compras: R$%.2f%n", totalSpent);
            System.out.printf("Média: R$%.2f%n", average); // TODO: Imprima a média
        }

        scanner.close();
    }
}