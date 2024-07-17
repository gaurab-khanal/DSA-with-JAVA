package com.gaurab;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class AllMissingNo {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findMissing(arr));
    }

    static void swap(int[] arr, int f, int s){
        int tmp = arr[f];
        arr[f] = arr[s];
        arr[s] = tmp;
    }


     static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

     static List<Integer> findMissing(int[] arr){
        sort(arr);
        List<Integer> list=new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]-1 != i){
                list.add(i+1);
            }
        }
        return list;
    }

}
