package com.gaurab;

public class Main {
    public static void main(String[] args) {
        // int[] rollNo = new int[10]; 
        // // or 
        // int[] rollNo2 = {25,63,83,181,3};

        int[] rollNo; // Declaration of array. rollNo is getting defined in the stack
        rollNo = new int[5];// initiatization // actually here object is being created in the heap memory

        // System.out.println(rollNo[3]);// default value is 0

        String[] arr = new String[4];
        System.out.println(arr[2]);// default valus is null
        // null can be assigned to non-primitives only

    }
}