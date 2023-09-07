package com.gaurab;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14};
        int ans = binarySearch(arr, 11);
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
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                start = mid + 1;
            }else if (target > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    // return -1 if it doesnot exist
    // for ascending
    static int binarySearchAsc(int[] arr, int target){
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


