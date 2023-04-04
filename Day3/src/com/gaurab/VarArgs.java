package com.gaurab;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
       multiple(2,4,"Gaurab", "Khanal", "Hello");
        // demo("Gaurab", "Khanal");
        
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

   
}

