package com.gaurab;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {1235, 345, 2, 6, 7896, 22};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int evenDigits = 0;
        
        for(int num: nums){
           if(even(num)){
            evenDigits++;
           }
        }
        return evenDigits;
    }
    // check if the digit is even or not
    // Tow ways: 
    // 1- Count no of digits
    // 2- Convert int to str and take length
    static boolean even(int num) {
        int noOfDigits = digits(num);
        
        return noOfDigits %2 == 0;
    }

    static int digits2(int num){
        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num) +1);
    }

    // count number of digits in a number
    static int digits(int num){
        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
