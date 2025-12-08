package rvt;

import java.util.Scanner;

class nameEcho {
    public static void nameEcho(Scanner in) {
        System.out.print("Enter your name: ");
        String name = in.nextLine().trim();

        int spcaeIndex = name.indexOf(' ');

        String first = name.substring(0);
        String last = name.substring(1);

        System.out.println(first + " " + last.toUpperCase());
    }
}

class chartAt {
    public static void nameEcho(Scanner in) {
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}