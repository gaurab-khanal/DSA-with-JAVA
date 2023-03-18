package com.gaurab;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat(); // Taking float
//        System.out.println(num); // If you pass 65(int) it converts that into float automatically.

//        int num = (int)(5353.63f);
//        System.out.println(num);

//        int a = 257;
//        byte b = (byte)(a); // 257%256 = 1;

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//
//        int d = a * b / c; // 20
//        System.out.println(d);

//        int number = 'a';
//        System.out.println(number); //97

        byte b = 42;
        char c = 'a';
        short s = 1044;
        int i = 5000;
        float f = 56.37f;
        double d = 0.8383;
        double result = (f * b) + (i/ c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        // float + int - double = double // multiple types are converted to double which is bigger among all.
        System.out.println(result);
    }
}
