package rvt;
import java.util.Scanner;

public class Thesequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int start = scanner.nextInt();

        System.out.println("Last number? ");
        int end = scanner.nextInt();

        int sum = 0;
        int i = start;

        while (i<=end) {
            sum += i;
            i++;
        }

        System.out.println("The sum is: " + sum);
    }
}
