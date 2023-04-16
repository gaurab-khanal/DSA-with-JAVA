package com.gaurab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // array of primitives
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 4;
        arr[3] = 465;
        arr[4] = 5;
        // [23, 45, 4, 465,5]
        // System.out.println(arr[3]);

        System.out.println(Arrays.toString(arr));
        // inputs using for loop;
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }

        // displaying the array
        // for(int i = 0; i<arr.length; i++){
        //   System.out.println(arr[i]);
        // }

        // using for each

        for(int num: arr){ // for every element in array, print the element
            System.out.println(num + " "); // here num represents the element of the array
        }

        // System.out.println(arr); // index out of bound error


        // Array of Objects

        String[] str = new String[5];

        for(int i = 0; i< str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        sum(6,7);
    }

    static void sum(int a, int b){
        System.out.println(a+b);
    }
}
