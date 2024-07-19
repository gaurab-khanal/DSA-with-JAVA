package com.gaurab;

import java.util.Arrays;
import java.util.Locale;

public class Method {
    public static void main(String[] args) {
        String name = "Gaurab Khanal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.concat("Hello"));
        System.out.println(name.indexOf("b"));
        System.out.println(" dsjdj  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.trim());
    }
}
