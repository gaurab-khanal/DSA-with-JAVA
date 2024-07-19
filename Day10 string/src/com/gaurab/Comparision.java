package com.gaurab;

public class Comparision {
    public static void main(String[] args) {
        String name = "Gaurab";
        String name2 = "Gaurab";


        System.out.println(name == name2); // check both values and reference variables

        // How to create diff object of same value?
        String a = new String("gaurab");
        String b = new String("gaurab");

        System.out.println(a.charAt(0));
        System.out.println(a == b); // false

        System.out.println(a.equals(b)); // check only for value
    }
}
