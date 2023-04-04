package com.gaurab;

import java.util.Arrays;

public class ChangeValue {
    
    public static void main(String[] args) {
        //creating an array
        int[] arr = {1,4,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
        

    }
    static void change(int[] nums){
        nums[0] = 11; // if you make a change to the object via this ref varaiable, same object will be changed
        
    }
}
