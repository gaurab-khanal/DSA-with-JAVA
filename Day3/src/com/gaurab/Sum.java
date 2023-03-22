package com.gaurab;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println("Sum = "+ ans);
        int ans = sum3(10, 30);
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }


    // return the value

    static int sum2(){ // int means it will return integer value
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return  sum; // function is over

//        System.out.println("This will not execute"); // any code below return will not execute
    }



    /*

        access modifier (we'll look in OOP) return_type name() {
            //body
            return statement;
        }

     */

}
