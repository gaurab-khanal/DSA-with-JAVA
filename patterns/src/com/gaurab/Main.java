package com.gaurab;

public class Main {
    public static void main(String[] args) {
//        pattern1(9);
//        pattern2(5);
        pattern28(5);
    }
    static void pattern1(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            for (int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            for (int col=1;col<=row;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            int colNo = (row>5)?n-row+1:row;
            for (int col=1;col<=colNo;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            int noOfSpaces = n-row;
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            int noOfSpaces = row-1;
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for (int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            int noOfSpaces = n-row;
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for (int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            int noOfSpaces = row-1;
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for (int col=1;col<=n*2-(2*row-1);col++){
                System.out.print("*");
            }
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern12(int n){
        for (int row = 1;row<=n;row++){
            // for every row , run the col
            int noOfSpaces = row-1;
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for (int col=1;col<=n-row+1;col++){
                System.out.print(" *");
            }
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern28(int n){
        for (int row = 1;row<=n*2;row++){
            // for every row , run the col
            int noOfSpaces = (row>n?row-n: n-row);
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            int noOfCol = (row>n?2*n-row:row);
            for (int col=1;col<=noOfCol;col++){
                System.out.print(" *");
            }
            for (int spaces = 1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }


}