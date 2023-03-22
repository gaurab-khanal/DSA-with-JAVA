package com.gaurab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take input of two number and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}