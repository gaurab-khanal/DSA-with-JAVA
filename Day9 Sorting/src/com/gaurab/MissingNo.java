package com.gaurab;
//https://leetcode.com/problems/missing-number/description/
public class MissingNo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 0;
        arr[2] = 1;
        System.out.println(findMissing(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int f, int s){
        int tmp = arr[f];
        arr[f] = arr[s];
        arr[s] = tmp;
    }

    static int findMissing (int[] arr){
        sort(arr);
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}
