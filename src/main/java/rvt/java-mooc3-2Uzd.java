package rvt;
import java.util.Scanner;
import java.util.ArrayList;

class OnlyTheseNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.print("From Where? ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("To Where? ");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
}