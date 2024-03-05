package com.gaurab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
      // syntax
        ArrayList<Integer> num = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        num.add(387);
        num.add(38);
        num.add(3);
        num.add(33);
        System.out.println(num);
        num.set(0, 99);
        System.out.println(num);
        num.remove(3);
        System.out.println(num);

        // input
        for (int i = 0; i<5; i++){
            num.add(in.nextInt());
        }

        for (int i = 0; i<num.size(); i++){
            System.out.println(num.get(i));
        }
    }
}


//
