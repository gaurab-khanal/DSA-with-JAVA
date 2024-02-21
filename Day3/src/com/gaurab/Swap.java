package com.gaurab;

public class Swap{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // int temp = a;
        // a = b;
        // b = temp;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "Gaurab";
        System.out.println(name);
        changeName(name);
        System.out.println(name);
}
    static void changeName(String name){
        name = "Hoho"; // not changing, creating a new object.
        System.out.println(name);
        // return name;
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = a;
    }

}