package com.gaurab.introduction;

public class wrapper {
    public static void main(String[] args) {
//        int a = 10;

//        Integer num = new Integer(45);
//        System.out.println(num.);
//        const b = 10;


         A gaurab = new A("GAurab Khanal");
        gaurab.name = "heyy";
//        System.out.println(gaurab.name);

        // when a non primitive is final you cannot reassign it.
//        gaurab = new A("hiiiii");
//        System.out.println(gaurab.name);

        A obj = new A("gaujhah");
        System.out.println(obj);

//        for (int i = 0; i<100000000;i++){
//            obj = new A("Random name");
//        }

    }
}

class A{
    final int num = 10;
    String name;
    public A(String name){
        System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed!");
    }
}
