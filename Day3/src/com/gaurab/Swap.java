package com.gaurab;

public class Swap{
    public static void main(String[] args) {
        int a = 7, b = 9;
        swap(a,b);
        System.out.println(a + " " + b);
        String name = "Gaurab Khanal";
        changeName(name);
        System.out.println(name);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b ;
        b  = temp;
        System.out.println("a = "+ a + " b = " + b);
    }
    static void changeName(String name){
        name = "Alex";
    }
}
