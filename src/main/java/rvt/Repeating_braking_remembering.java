package rvt;
import java.util.Scanner;

// Part 1 - Reading

// public class Repeating_braking_remembering {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Give numbers: ");
//        while (true) {
//            int number = Integer.parseInt(scanner.nextLine());
//            if (number == -1) {
//                System.out.println("Thx! Bye!");
//                break;
//            }
//        }
//    }




// Part 2 - Sum of numbers

//    public class Repeating_braking_remembering {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//
//        System.out.println("Give numbers: ");
//        while(true) {
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == -1) {
//                System.out.println("Thx, bye!");
//                break;
//            }
//            sum += number;
//        }
//
//        System.out.println("Sum: " + sum);
//
//    }
//}
//}




// Part 3 - Sum and the number of numbers

// public class Repeating_braking_remembering {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        System.out.println("Give numbers: ");
//        while(true) {
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == -1) {
//                System.out.println("Thx, bye!");
//                break;
//            }
//            sum += number;
//            count++;
//     }
//        System.out.println("Sum: " + sum);
//        System.out.println("Numbers: " + count);
//}
//}




// Part 4 - Average of numbers

// public class Repeating_braking_remembering{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        System.out.println("Give numbers: ");
//        while(true) {
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == -1) {
//                System.out.println("Thx, bye!");
//                break;
//           }
//            sum += number;
//            count++;
//        }
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Numbers: " + count);
//        if (count > 0) {
//            System.out.println("Average: " + (1.0 * sum / count));
//        }
//    }
//}


// Part 5 - Even and odd numbers

public class Repeating_braking_remembering{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers: ");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx, bye!");
                break;
            }
            sum += number;
            count++;
            if (number % 2 == 0) {
            } else {
                odd++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        if (count > 0) {
            System.out.println("Average: " + (1.0 * sum / count));
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
