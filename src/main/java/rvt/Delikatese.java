package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: ");
        String product = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        double price = scanner.nextDouble();

        System.out.println("Ekspress piegade (0==ne, 1==ja): ");
        int express = scanner.nextInt();

        double shipping = 0.0;
        if (price < 10) {
            shipping = 2;
        }

        if (express == 1) {
            shipping = shipping + 3;
        }

        double total = price + shipping;

        System.out.println();
        System.out.println("Rekins:");
        System.out.println("Prece: " + product + "Cena: " + price);
        System.out.println("Piegade: " + express);
        System.out.println("Kopa: " + total);
    }
}