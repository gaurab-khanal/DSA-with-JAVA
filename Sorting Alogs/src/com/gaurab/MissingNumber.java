package com.gaurab;
// https://leetcode.com/problems/missing-number/description/
// Amazon Question
class MissingNumber {
    public int missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] ;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index< arr.length; index++){
            if (arr[index] != index){
                return index;
            }

            return arr.length;
        }
    }
    static void swap(int arr[], int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}