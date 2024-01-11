package com.gaurab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23,29,15,19,31,7,9,5,2};
        int[] arr2 = {3,5,4,2,1};
        cyclicSort((arr2));
        System.out.println(Arrays.toString((arr2)));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, correctIndex, i);
            }else {
                i++;
            }
         }
    }

    static void shellSort(int[] arr){
        int n = arr.length;
        for (int gap = n/2; gap>=1; gap=gap/2){  // take gap = n/2 and decrease it by gap/2
            // take index of j = gap and run it till j<n and do j++
            for (int j = gap;j<n;j++){
                // take i = j-gap so that this index can be compared with i+ gap and swapping can be done
                for (int i = j-gap;i>=0;i = i-gap){
                     if (arr[i+gap]> arr[i]){
                         break;
                     }else {
                         swap(arr, i+gap, i);
                     }
                }
            }

        }
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i<=arr.length -2; i++){
            for (int j= i + 1; j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
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
