package com.gaurab;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Source;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        // 1 2 3
        // 4 5 6 
        // 7 8 9

        // int[][] arr = new int[3][3];

        // int[][] arr = {
        //     {1,2,3}, // oth index
        //     {4,5,6}, // 1st index
        //     {7,8,9} // 2nd index-> arr[2][0] = 7
        // };
        int[][] arr = new int[3][3];

        // input

        for(int row = 0; row < arr.length; row++){
            // for ecah col in every row
            for (int col = 0; col< arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        // for(int row = 0; row < arr.length; row++){
        //     // for ecah col in every row
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }    
}
