package com.gaurab;

import java.util.ArrayList;
import java.util.List;

// Asked in google
class FindAllMissingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i< nums.length){
            int correctIndex = nums[i] -1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index< nums.length; index++){
            if (nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }



     void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}