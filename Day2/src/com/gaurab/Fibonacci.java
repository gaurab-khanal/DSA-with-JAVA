package com.gaurab;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a);
        while (count <= n){
            int temp = b;
            b = b + a;
            System.out.print(" "+ b);
            a = temp;
            count++;
        }
    }
}
