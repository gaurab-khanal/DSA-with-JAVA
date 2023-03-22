package com.gaurab;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x);// Scope will begin when value is initialized
        x = 89;
        System.out.println(x);// 89
        fun();
    }
    static void  fun(){
        System.out.println(x);
    }

}
