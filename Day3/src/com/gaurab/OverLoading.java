package com.gaurab;

public class OverLoading {
    public static void main(String[] args) {
        fun("gaurab");
        fun(87326);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
