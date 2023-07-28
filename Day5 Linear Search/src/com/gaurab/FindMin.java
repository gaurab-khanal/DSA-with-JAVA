package com.gaurab;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {8,5,3,4,5,-6,7,8,9};
        System.out.println(min(arr));
    }
    // assume arr/length!= 0
    static int min(int[] arr){
        int min = arr[0];
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
