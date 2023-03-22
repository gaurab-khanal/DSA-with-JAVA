package com.gaurab;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//            int a = 89;// already initilized outside the block in the same method hence you cannnot initilize again
            a = 89; // reassigning the origin ref variable to some other value
            int c = 78;
            System.out.println(c + " "+ a);
            // value initilized in this block, will remain in block
        }
        System.out.println(a);

//        System.out.println(num);

        // scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
//        System.out.println(i);// cannot access i outside the for loop.
    }
    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
