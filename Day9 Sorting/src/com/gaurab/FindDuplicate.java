package com.gaurab;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println( findduplicate(arr));

    }
    static void swap(int[] arr, int f, int s){
        int tmp = arr[f];
        arr[f] = arr[s];
        arr[s] = tmp;
    }

    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }
    static int findduplicate(int[] arr){
        sort(arr);
        for (int i = 0; i<arr.length; i++){
            if(arr[i] != i+1){
                return arr[i];
            }
        }
        return -1;
    }
}
