package Oops;

public class oops {
    public static void main(String[] args) {
        // We create the student inside the main method so the code actually runs
        Student s1 = new Student();

        // Example of using the parameterized constructor
//        Student s2 = new Student("Deepak");
//        Student s3=new Student("123");
        s1.name="shradha";
        s1.roll=123;
        s1.password="deep@123";

        s1.marks[0]=100;
        s1.marks[1]=300;
        s1.marks[2]=50;
//      copy constructer
        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=20;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }


    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];


    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;

    }

    Student() {
        marks=new int[3];

        System.out.println("constructor is called...");
    }

    Student(String name) {
        marks=new int[3];
        this.name = name;
        System.out.println("Student created with name: " + this.name);
    }

    Student(int roll) {
        marks=new int[3];
        this.roll = roll;
    }
}
