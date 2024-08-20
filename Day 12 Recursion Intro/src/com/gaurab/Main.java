package com.gaurab;

public class Main {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print 1st 5 numbers

        System.out.println("Hello world!");
        printNum(1);
    }
    static void printNum(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
}