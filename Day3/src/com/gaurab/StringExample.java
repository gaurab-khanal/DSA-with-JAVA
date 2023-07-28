package com.gaurab;

import java.util.Scanner;

public class StringExample{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your name");
      String name = in.nextLine();

      String ans = greet(name);
      System.out.println(ans);
    }

    static String greet(String name){
        return "Hello " + name; 
    }
}
