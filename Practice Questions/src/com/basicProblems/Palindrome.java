package com.basicProblems;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println("IsNum palindrome: " + isPalindrome(x));
        in.nextLine();
        String y = in.nextLine();
        System.out.println("IsString Palindrome: " + isPalindromeStr(y));

    }

    static boolean isPalindromeStr(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            // Check if character is non-alphanumeric.
            // If it is, then skip that character and move to the next.

            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }
    static boolean isPalindrome(int x){
        if (x<0){
            return false;
        }
        else{
            int num = x;
            int rev = 0;
            while(x!=0){
                int rem = x%10;
                rev = rev * 10 + rem;
                x = x/10;
            }
            if (num ==rev){
                return true;
            }
        }
        return false;
    }
}
