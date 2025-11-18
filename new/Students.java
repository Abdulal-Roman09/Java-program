public class Students {

    String name;
    int roll;
    String department;
    float GPA;

    // Default constructor
    Students() {
        System.out.println("Default Constructor Called");
        name = "Unknown";
        roll = 101;
        department = "CSE";
        GPA = 3.0f;
    }

    // Constructor with name and roll
    Students(String name, int roll) {
        this();
        this.name = name;
        this.roll = roll;
    }

    // Constructor with all parameters
    Students(String name, int roll, String department, float GPA) {
        this(name, roll);
        this.department = department;
        this.GPA = GPA;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + 
                           ", Roll: " + roll + 
                           ", Department: " + department + 
                           ", GPA: " + GPA);
    }

    // Main method
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students("Rahim", 102);
        Students student3 = new Students("Sabit", 103, "CSE", 3.7f);

        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println("\nStudent 2 Details:");
        student2.display();
        System.out.println("\nStudent 3 Details:");
        student3.display();
    }
}
