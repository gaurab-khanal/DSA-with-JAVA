package com.gaurab;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fn = in.nextInt();
        int sn = in.nextInt();
        int count=0;

        while (fn>0){
            int rem = fn%10;
            if (rem == sn){
                count++;
            }
            fn = fn/10;
        }
        System.out.println(count);

    }
}
