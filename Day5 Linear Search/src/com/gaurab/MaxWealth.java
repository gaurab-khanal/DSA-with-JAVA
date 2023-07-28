package com.gaurab;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] arElem: accounts){ // person
            int perWealth = 0;
            for(int elem: arElem){ // person bank account
                perWealth = perWealth + elem;
            }
            if (perWealth > maxWealth){
                maxWealth = perWealth;
            }
        }
        return maxWealth;
    }
    
}
