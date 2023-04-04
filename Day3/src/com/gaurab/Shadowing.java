package com.gaurab;

public class Shadowing {
    static int x = 88; //this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x);
        int x;
        // System.out.println(x); // scope will begin when value is initilized
        x = 78;
        fun();
    }

    static void fun(){
        System.out.println(x);
    }

}
