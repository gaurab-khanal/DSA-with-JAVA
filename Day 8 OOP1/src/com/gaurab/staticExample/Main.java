package com.gaurab.staticExample;

public class Main {
    public static void main(String[] args) {
        Human gaurab = new Human(19, 35353, "Gaurab", false);
        Human rahul = new Human(44, 2322, "Rahul", true);
        Human anil = new Human(44, 2322, "Anil", true);

        System.out.println(Human.population);
    }

    // this is not dependent on objects
    static void fun(){

//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in doesnot depend on instance

        // You cannot access non static stuff without referencing their instances in
        // a static context

        // hence here I am referencing it.
        Main obj = new Main();
        obj.greeting();
    }
    // we know something which is non-static, belong to an object
    void greeting(){
        System.out.println("Hello world");
    }

}
