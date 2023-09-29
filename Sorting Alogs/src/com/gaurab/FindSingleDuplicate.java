package com.gaurab;

class FindSingleDuplicate {
    public int findDuplicate(int[] nums) {
        int i = 0;

        while(i<nums.length){
            if(nums[i] != i+1){
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums, i, correctIndex);
                }
                else{
                    return nums[i];
                }
             }else{
                 i++;
             }
        }
        
        return -1;
    }
    void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}