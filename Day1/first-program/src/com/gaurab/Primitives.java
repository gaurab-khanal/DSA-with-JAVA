package com.gaurab;

public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64;// 4bytes
        char letter = 'a';// 2bytes
        float marks = 78.97f;//4bytes
        // 'f' is added at last cause all the decimal values are by default double
        // so to store that using float 'f' is added.
        double largeDecimalsNumbers = 82538727.7743;// 8bytes
        long largeInteger = 962397469828423294L;// 8bytes
        // 'L' is added at last cause all the int values are by default int
        // so to store that using float 'L' is added.
        boolean check = true;// 1bit
    }
}
