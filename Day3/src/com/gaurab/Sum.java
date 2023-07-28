package com.gaurab;

import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        try (// Take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in)) {
            System.out.println("Enter 2 numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            // sum(a, b);
            int ans = sum2(a, b);
            System.out.println("Sum = " + ans);
        }
    }

    static void sum(int a, int b){
        System.out.println("Sum = " + (a + b));
    }

    static int sum2(int a, int b ){
        return a + b;// function is terminated from return statement
        // this will never execute
    }
    /* Syntax:

        access modifier(look in OOP) return_type name(){

        }

     */
}