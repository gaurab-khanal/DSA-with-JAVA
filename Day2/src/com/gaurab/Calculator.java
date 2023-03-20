package com.gaurab;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x.
        int ans = 0;
        while (true){
            // take the operator as input.
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op =='+' || op=='-' || op == '/' || op == '*' || op == '%'){
                // input tw numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                    System.out.println("Sum = "+ ans);
                } else if (op == '-') {
                    ans = num1 - num2;
                    System.out.println("Difference = "+ ans);
                }else if (op == '*') {
                    ans = num1 * num2;
                    System.out.println("Product = "+ ans);
                }else if (op == '/') {
                    if (num2!=0) {
                        ans = num1 / num2;
                        System.out.println("Division = "+ ans);
                    }else {
                        System.out.println("Error");
                    }
                }else if (op == '%') {
                    ans = num1 % num2;
                    System.out.println("Remainder = "+ ans);
                }else {
                    System.out.println("Error!");
                }

            } else if(op=='x' || op=='X'){
                break;
            }else {
                System.out.println("Invalid Operator!");
            }

        }

    }
}
