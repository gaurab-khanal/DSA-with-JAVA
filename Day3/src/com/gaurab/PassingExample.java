package com.gaurab;

import static com.gaurab.StringExample.greet;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Gaurab Khanal";
        greet(name);
    }
    static void greet(String nam){
        System.out.println(nam);
    }

}
