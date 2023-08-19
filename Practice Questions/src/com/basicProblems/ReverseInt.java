package com.basicProblems;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(reverse(x));
    }

    static int reverse(int x) {
        long num = x;
        long rev = 0;
        while(x!=0){
            int rem = x%10;
            rev = rev * 10 + rem;
            x = x/10;
        }

        if(rev> Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1 * rev);
        }
        return (int)(rev);

    }
}
