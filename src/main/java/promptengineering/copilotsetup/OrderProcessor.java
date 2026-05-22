package promptengineering.copilotsetup;

import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = 0;

        System.out.println("Digite o valor total dos itens: ");
        double itemsValue = scanner.nextDouble();

        System.out.println("Digite o valor do frete: ");
        double shipping = scanner.nextDouble();

        System.out.println("É a primeira compra? (true/false)");
        boolean firstPurchase = scanner.nextBoolean();

        if (firstPurchase) {
            discount = itemsValue * 0.05;
            System.out.println("Desconto aplicado: R$" + discount);
        }

        double discountedValue = itemsValue - discount;

        if (itemsValue >= 200.0) {
            shipping = 0;
        }

        double finalValue = discountedValue + shipping;

        System.out.printf("Valor final: R$%.2f", finalValue);

        scanner.close();
    }
}
