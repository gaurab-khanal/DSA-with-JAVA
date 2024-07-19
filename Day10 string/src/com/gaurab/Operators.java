package com.gaurab;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        Integer n = 10;
        System.out.println(n);
        System.out.println('a' + 'b'); // adds ascii value
        System.out.println("a" + "b"); // ab
        System.out.println((char)('a' + 3)); // d

        System.out.println("a" + 1);
        // when interger is added to string, integer will be converted into Integer that will call toString()
        List<Integer> nm = new ArrayList();
        System.out.println(nm);
        System.out.println("Gaurab" + nm); // Gaurab[4]
    }
}
