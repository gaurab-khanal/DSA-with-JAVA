package com.gaurab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 9, 20,15};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i< arr.length;i++){
            //find the max item index in the array and swap with correct index;
            int lastIndex = arr.length -1-i;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int first, int second){
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
    static int getMaxIndex(int[] arr, int start, int lastIndex){
        int max = start;
        for (int i= start; i<=lastIndex;i++){
            if (arr[i]> arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void bubbleSort(int[] arr){
        // run the steps n-1 times
        for (int i = 0; i<arr.length; i++){
            // for each step max item will come at the end;
            boolean isSwapped = false;
            for (int j = 1; j< arr.length-i;j++){
                // swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            // if you didnt swapped for an particular value of i it means array is sorted then break the program
            if (!isSwapped) return;
        }
    }
}
