package com.gaurab;

import java.util.Scanner;

public class Questions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // System.out.println(isPrime(n));
       for(int i = 100;i<=10000;i++){
        if (isArm(i)){
            System.out.println(i);
        }else{
            // System.out.println("Not ArmStrong");
        }
       }

    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;

        while (c*c <=n){
            if (n%c == 0){
                return false;
            }
            c++; 
        }

        return c * c> n;

    }

    static boolean isArm(int n){
        int orignal = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return sum == orignal;
    }
}