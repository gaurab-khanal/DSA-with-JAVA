package com.gaurab;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long fn = in.nextInt();
        long sn = in.nextInt();
        int count = 0;
        while(fn!=0){
            long tmp = fn%10;
            if(tmp == sn){
                count++;
            }
            fn=fn/10;
        }

        System.out.println(count);

    }
}
