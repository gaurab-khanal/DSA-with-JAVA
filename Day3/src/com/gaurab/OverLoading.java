package com.gaurab;

public class OverLoading {
    public static void main(String[] args) {
        // fun("gaurab");
        // fun(87326);
        // fun(); // error if paramaters isn't passed in case of overloading
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
// two functions of same name can exits if the paramaters are different. This is called function overloading.