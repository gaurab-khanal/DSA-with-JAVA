package com.gaurab;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        // If Else statement
        if (age>=18){
            System.out.println("You are elgible for voting.");
        }else{
            System.out.println("You are not eligible for voting.");
        }

        System.out.print("Enter a number: ");
        int num = input.nextInt();
//         If Statement
        if (num<0 && num!=0){
            System.out.println(num+" is a negative number.");
        }

        // Multiple If-Else

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        if(num1>0){
            System.out.println(num1 + " is a positive number.");
        } else if (num1<0) {
            System.out.println(num1+" is a negative number.");
        }else{
            System.out.println(num1 + " is zero.");
        }
    }
}