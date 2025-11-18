class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int roll;
    String department;

    Student(String name, int age, int roll, String department) {
        super(name, age);
        this.roll = roll;
        this.department = department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Roll: " + roll + ", Department: " + department);
    }

    public static void main(String[] args) {
        Student student = new Student("Roman", 20, 101, "CSE");
        student.display();
    }
}
