package com.gaurab.staticExample;




// outside class cannot be static.
public class InnerClasses {
    static class Test{
         String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {

        Test a = new Test("gaurab");
        Test b = new Test("ujwal");

        System.out.println(a);
        System.out.println(b.name);

    }
}
