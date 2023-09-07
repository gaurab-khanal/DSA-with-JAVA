package com.gaurab;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14};
        int ans = binarySearch(arr, 11);
        System.out.println(ans);
    }

    

    // return -1 if it doesnot exist
    // for ascending
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; // might be possibe that (start + end) exceed the range of integer in java
            int mid = start + (end - start)/2;
            
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            } else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
}