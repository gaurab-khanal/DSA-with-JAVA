package com.gaurab;

class FindDuplicateAndMissingNO {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] -1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        // check for duplicate and missing no
        for (int index = 0; index<nums.length; index++){
            if (nums[index] != index+1){
                return new int[] {nums[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }

    void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}