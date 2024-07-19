package com.gaurab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Gaurab Khanal";
        String name2 = name;
        name2 = "Hello";
        System.out.println(name);
        System.out.println(name2);
        int[] ar1 = {1,2};
        int[] ar2 = ar1;
        ar2[0] = 8;
        System.out.println(Arrays.toString(ar1));
        System.out.println(name);
    }
}