package com.gaurab;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,2,15,8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] num){
    num[0] = 100; // if you make a change to the object via this ref variable same object will be changed
    }
}
