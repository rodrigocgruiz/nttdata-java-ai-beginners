package promptengineering.copilotsetup;

import java.util.Scanner;

public class CashbackCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double discount = 0;
        double cashback = 0;

        System.out.println("Digite o valor total das compras:");
        double productsValue = scan.nextDouble();
        scan.nextLine();

        System.out.println("Digite o código do cupom:");
        String couponCode = scan.nextLine();

        if (couponCode.equalsIgnoreCase("DESC10")) {
            discount = productsValue * 0.10;
        }

        double discountedValue = productsValue - discount;

        if (discountedValue >= 150.00)
            cashback = 15.0;

        double finalValue = discountedValue - cashback;

        System.out.printf("Valor final: R$ %.2f | Cashback: R$ %.2f\n", finalValue, cashback);

        scan.close();
    }
}
