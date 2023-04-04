package com.gaurab;

import java.util.Scanner;

public class StringExample{
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        String personalizedString = myGreet(name);
        System.out.println(personalizedString);
    }

    static String myGreet(String name){
        return "Hello " + name;
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
