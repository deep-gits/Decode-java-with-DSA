package Oops;

public class oops {
    public static void main(String[] args) {
        // We create the student inside the main method so the code actually runs
        Student s1 = new Student();

        // Example of using the parameterized constructor
        Student s2 = new Student("Deepak");
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("constructor is called...");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Student created with name: " + this.name);
    }

    Student(int roll) {
        this.roll = roll;
    }
}
