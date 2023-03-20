package com.gaurab;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev=0;
        while (num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /=10;
        }
        System.out.println("Reverse = "+ rev);
    }
}
