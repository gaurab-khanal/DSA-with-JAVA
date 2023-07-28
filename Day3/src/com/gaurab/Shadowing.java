package com.gaurab;

public class Shadowing {
   static int x = 90; // this will be shadowed at line 7
    public static void main(String[] args) {
        int a; //declaration
        a = 5; // initiliaze
        System.out.println(x);
        int x = 40; // shadowing begin at initialization not declaration
        // scope will begin when value is initialized
        System.out.println(x);
        fun();
    }


    static void fun(){
        System.out.println(x);
    }
}
