package com.gaurab;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
//        armstrong();
        System.out.println(isArmStrong(9474));

//        for (int i = 100; i<=9999;i++){
//            if (isArmStrong(i)){
//                System.out.println(i);
//            }
//        }
    }
    // Print all the 3 digits armstrong numbers
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n %10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
    //Check prime or not prime
    static String isPrime(int n) {
        if (n<=1){
            return "Not prime";
        }
        int c = 2;
        while (c*c <=n){
            if (n%c == 0){
                return "Not Prime";
            }
            c++;
        }
        return (c * c > n) ? "Prime": "Not Prime";
    }
}
