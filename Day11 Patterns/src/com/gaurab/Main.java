package com.gaurab;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        pattern4(5);
//        pattern5(9);
//        pattern5(5);
//        pattern28(5);
//        pattern17(4);
        pattern31(4);
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2*n;
        for (int row = 0; row <=n ; row++) {
            int print = row>n ? row-n :  n-row;
            for (int col = 0; col <=n ; col++) {
                int atEveryIndex = originalN -  Math.min(Math.min(row,col), Math.min(n-col, n-row));
                    System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= 2* n; row++) {
            int c = row > n ? 2*n -row : row;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <=c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int criteria = 2*row-1;
            int spaces = n-row;
            for (int s = 0; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= criteria; col++) {
                int criteria2 = (row+1) -col;
                int print = criteria2 >0  ? criteria2: (col-row)+1;
                System.out.print(" "+ print);
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 1; row <= 2*n -1; row++) {
            int criteria = row > n ? 2*n -row : row;
            int noOfSpaces = n-criteria ;
            for (int s = 0; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= criteria; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
            int criteria = row > n ? 2*n -row : row;
            for (int col = 1; col <=criteria ; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n ){
        for (int row = n; row >0; row--) {
            for (int col = row; col >0 ; col--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row<=n; row++){
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}