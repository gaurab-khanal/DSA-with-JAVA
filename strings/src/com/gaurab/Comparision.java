package com.gaurab;

public class Comparision {
    public static void main(String[] args) {
        String a = "Gaurab";
        String b = "Gaurab";

        // ==
        System.out.println(a == b);

        String name1 = new String("Gaurab");
        String name2 = new String("Gaurab");
//
        System.out.println(name1 == name2); // checks both reference variable and values, objects locations
        System.out.println(name1.equals(name2)); // checks only values of reference variable
    }
}
