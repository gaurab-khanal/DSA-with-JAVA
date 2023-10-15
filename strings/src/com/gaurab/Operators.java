package com.gaurab;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a'+ 3)); //d

        System.out.println("a" + 1); //a1
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Gaurab"+ new ArrayList<>());
        System.out.println("Gaurab"+ new Integer(77));
        String ans = new Integer(33) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
