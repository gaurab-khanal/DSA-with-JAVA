package com.gaurab;

public class Palindrome {
    public static void main(String[] args) {
        String n = "abcba";
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(String n){
        if (n == null || n.length() == 0){
            return true;
        }
        int len = n.length()-1;
        n  = n.toLowerCase();

        for (int i = 0; i < n.length()/2; i++) {
            if(n.charAt(i) != n.charAt(len)){
                return false;
            }
            len--;
        }
        return true;
    }
}
