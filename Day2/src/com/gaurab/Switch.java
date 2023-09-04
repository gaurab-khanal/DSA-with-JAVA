package com.gaurab;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayNo = in.nextInt();

        switch (dayNo) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Please enter valid number");
        }

    }
}
