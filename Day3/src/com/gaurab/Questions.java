package com.gaurab;

import java.util.Scanner;

public class Questions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = in.nextInt();
        // System.out.println(armStrong(num));
        // System.out.println(isPrime(num));

        // armstrong from 1 to 1000

        for (int i = 1; i<200000; i++){
            if (armStrong(i)){
                System.out.print(" " + i + " ");
            }
        }
    }

    static boolean armStrong(int num){
        int sum = 0;
        int originalNum = num;
        int dup1 = num;
        int numDigits = 0;
        while (dup1>0){
            dup1 = dup1 / 10;
            numDigits++;
        }
        
        while (num>0){
            int rem = num % 10;
            sum += Math.pow(rem, numDigits);
            num = num /10;
        }
        if (originalNum == sum){
            return true;
        }
        return false;
    }

    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }                       
        int count = 2;

        while (count * count <= num){
            if (num % count == 0){
                return false;
            }
            count++;
        }
        return true;
}
}