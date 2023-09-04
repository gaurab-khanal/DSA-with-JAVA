package com.gaurab;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=num){
            int tmp =  b;
            b= a + b;
            a = tmp;
            count++;
        }
        System.out.println(b);
    }
}
