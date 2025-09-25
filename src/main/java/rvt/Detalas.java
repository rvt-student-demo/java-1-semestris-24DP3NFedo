package rvt;
import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SKRUVE_PRICE = 5;
        final int UZGRIEZNI_PRICE = 3;
        final int PAPLAS_PRICE = 1;

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ievadi skruvju skaitu: ");
        int skruves = scanner.nextInt();

        System.out.println("Ievadi uzgrieznu skaitu: ");
        int uzgriezni = scanner.nextInt();

        System.out.println("Ievadi paplaksnu skaitu: ");
        int paplaksni = scanner.nextInt();

        if (uzgriezni < skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgriznu");
        } else if (paplaksni < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        } else {
            System.out.println("Pasutijums ir kartiba");
        }

        int total = skruves * SKRUVE_PRICE + uzgriezni * UZGRIEZNI_PRICE + paplaksni * PAPLAS_PRICE;

        System.out.println("Kopeja cena: " + total);
    }
}