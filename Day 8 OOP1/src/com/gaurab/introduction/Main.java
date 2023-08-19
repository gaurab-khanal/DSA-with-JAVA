package com.gaurab.introduction;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5]; // declare reference to oject, in stack memory
//        students = new Student[5]; // allocae a students object in heap memory==> Dynamic  Allocates memory
//        Student student1;
//        System.out.println(student1)
//        System.out.println(Arrays.toString(students));

//        Student Gaurab;
//        Gaurab = new Student();

        Student Gaurab = new Student(66,"Gaurab khanall", 89.8f);
//        Student rahul = new Student();
//        System.out.println(rahul.marks);
//        Gaurab.name = "Gaurab Khanal";
//        Gaurab.roll = 88;
//        Gaurab.marks = 77.88f;
//        Gaurab.changeName("Anil");
        Gaurab.greeting();
        Student Anil = new Student(77,"Anil", 88.6f);
        System.out.println(Gaurab.marks);
        System.out.println(Gaurab.name);
        System.out.println(Gaurab.roll);

        Student random = new Student(Anil);
        System.out.println(random.name);

        Student one = new Student("something");
        Student two = one;

//        one.name = "SOmsthing";
        System.out.println(two.name);
    }

}

class Student{
    int roll;
    String name;
    float marks;

    // we need a way to add the values of above
    // properties ojbect by object

    // we need one word to access every object


    void greeting(){
        System.out.println("Hwllo my name is "+ this.name);
    }

    void changeName(String newName){
        name = newName;
    }
   Student(String name){
//       this.name = "Gaurab Khanal";
//       this.roll = 88;
//       this.marks = 77.88f;
         this.name = name;
       /// this is how you call constructor from another constructor
//       this(12,"Ujwal", 77.99f);
       // internally above is new Student(12, "Ujwal", 77.99f);
   }

   // copy constructor
   Student (Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
   }

   // parameterised constructor
    Student(int rollno, String namee, float markss){
        this.name = namee;
        this.roll = rollno;
        this.marks = markss;
    }


}