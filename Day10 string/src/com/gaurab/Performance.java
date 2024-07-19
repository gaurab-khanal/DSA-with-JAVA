package com.gaurab;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch; // new object is created each time //time complexity O(n^2) Solution: StringBuilder
        }
        System.out.println(series);
    }
}
