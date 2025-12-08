package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void nameEcho(Scanner in) {
        System.out.print("Enter your name: ");
        String name = in.nextLine().trim();

        int spcaeIndex = name.indexOf(' ');

        String first = name.substring(0);
        String last = name.substring(1);

        System.out.println(first + " " + last.toUpperCase());
    }
}