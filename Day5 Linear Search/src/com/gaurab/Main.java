package com.gaurab;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,7,9,2,33,99,56};
        int target = 100;

        // int ans = linearSearch(nums, target);
        // System.out.println(ans);

        System.out.println(linearSearch2(nums, target));
        
    }

    // search the target and return the element

    static int linearSearch2(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
    
        // Iterate over each element in array and compare it with target
        // if found return index 
        // else return -1
        for(int element: arr){
            if (element == target){
                return element;
            }
        }
    
        return Integer.MAX_VALUE;
    
       }

       // search the element and return true or false
       static boolean linearSearch3(int[] arr, int target){
        if (arr.length==0){
            return false;
        }
    
        // Iterate over each element in array and compare it with target
        // if found return index 
        // else return -1
        for(int index = 0; index < arr.length; index++){
            // check the element and target element
            if (arr[index] == target){
                return true;
            }
        }
    
        return false;
    
       }

    // search in the array: return the index if item found
    // else return -1
   static int linearSearch(int[] arr, int target){
    if (arr.length==0){
        return -1;
    }

    // Iterate over each element in array and compare it with target
    // if found return index 
    // else return -1
    for(int index = 0; index < arr.length; index++){
        // check the element and target element
        if (arr[index] == target){
            return index;
        }
    }

    return -1;

   }
}