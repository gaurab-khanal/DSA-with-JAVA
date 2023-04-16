package com.gaurab;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,77,8,9};
        System.out.println(max(arr));
    }   

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i< arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
