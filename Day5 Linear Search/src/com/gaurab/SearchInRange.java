package com.gaurab;
// search for the element in the range of index [a,b];
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 3, 1, 5));
    }

    static int search(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        // search for the element- 3 in the range [1,5];
        // run for loop betn index 1-5;
        for(int index = start; index<=end; index++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
