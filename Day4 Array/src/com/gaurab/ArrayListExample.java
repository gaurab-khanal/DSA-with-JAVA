package com.gaurab;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

        list.add(89);
        list.add(28);
        list.add(827);
        list.add(36);

        list.set(0, 262);
        // System.out.println(list.contains(827));
        // System.out.println(list.contains(8));

        list.remove(0);
        // System.out.println(list);

        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i<5; i++){
           System.out.println( list.get(i)); // list[index] syntax will not work here
         }
    }
}
