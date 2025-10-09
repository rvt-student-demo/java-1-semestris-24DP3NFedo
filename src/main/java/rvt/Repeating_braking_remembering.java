package rvt;
import java.util.Scanner;

public class Repeating_braking_remembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
        }
    }
}
