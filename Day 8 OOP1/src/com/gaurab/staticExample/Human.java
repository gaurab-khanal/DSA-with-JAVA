package com.gaurab.staticExample;

public class Human {
    int age;
    int Salary;
    String name;
    boolean isMarried;
     static long population;

     static void message(){
         System.out.println("Hello worlddd");
     }
    public Human(int age, int salary, String name, boolean isMarried) {
        this.age = age;
        Salary = salary;
        this.name = name;
        this.isMarried = isMarried;
        Human.population += 1;
    }
}
