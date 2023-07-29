package com.gaurab.staticExample;

public class Main {
    public static void main(String[] args) {
        Human gaurab = new Human(19, 35353, "Gaurab", false);
        Human rahul = new Human(44, 2322, "Rahul", true);
        Human anil = new Human(44, 2322, "Anil", true);

        System.out.println(Human.population);
    }
}
