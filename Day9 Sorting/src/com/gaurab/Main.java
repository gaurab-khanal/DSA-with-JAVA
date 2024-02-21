package com.gaurab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        int e = arr.length;
        mergeSortInplace(arr, 0, e);


        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInplace(int[] arr, int s,int e){
        if (e-s == 1){
            return;
        }
        int m = (s+e)/2;

        mergeSortInplace(arr,s,m);
        mergeSortInplace(arr,m, e);

        mergeInPlace(arr, s, m, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];

        int i= s;
        int j = m;
        int k = 0;

        while (i<m && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }


    static int[] mergeSort(int[] arr){
        if (arr.length ==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i< first.length && j< second.length){
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;

            }else {
                mix[k] = second[j];
                j++;

            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return  mix;
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
