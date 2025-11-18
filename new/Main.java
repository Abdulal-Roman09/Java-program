class Person {
    String name;
    int age;
}

class Student extends Person {
    int roll;
    String department;
}

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sabit";
        s.age = 19;
        s.roll = 102;
        s.department = "CSE";

        System.out.println("Name: " + s.name +
                           ", Age: " + s.age +
                           ", Roll: " + s.roll +
                           ", Department: " + s.department);
    }
}
