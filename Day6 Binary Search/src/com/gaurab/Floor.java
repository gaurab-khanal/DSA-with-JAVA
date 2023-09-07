package com.gaurab;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = binarySearch(arr, 15);
        System.out.println(ans);
    }

    // check if the array is ascending or descending
    // if ascending return 1 else return -1

    static int binarySearch(int[] arr, int target){
        if (arr[0]<arr[arr.length -1]){
            return binarySearchAsc(arr, target);
        }else{
            return binarySearchDes(arr, target);
        }
    }

    // return -1 if it doesnot exits
    // for descending

    static int binarySearchDes(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            // find middle element
            // if target element is greater than the greatest element in array
            if(target>arr[0]){
                return -1;
            }
            if(target<arr[arr.length-1]){
                return -1;
            }

            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                start = mid + 1;
            }else if (target > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return start;
    }

    // return -1 if it doesnot exist
    // for ascending
    static int binarySearchAsc(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; // might be possibe that (start + end) exceed the range of integer in java
            // if target element is less than the smallest element in array
            if(target>arr[arr.length-1]){
                return -1;
            }
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
        return end;
    }
    // can do this as well
    static int binarySearch2(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; // might be possibe that (start + end) exceed the range of integer in java
            int mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

/// can DO this as well


