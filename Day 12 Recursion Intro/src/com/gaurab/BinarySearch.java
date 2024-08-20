package com.gaurab;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ans = BS(arr, 0, arr.length-1,  66) ;
        System.out.println(ans);
    }
    static int BS(int[] arr, int s, int e, int target){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }

        if(target>arr[m]){
            return BS(arr, m+1, e, target);
        }

        return BS(arr,s, m-1, target );

    }
}
