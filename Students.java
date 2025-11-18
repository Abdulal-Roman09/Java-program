public class Students {

    String name;
    int roll;

    // Default constructor
    Students() {
        name = "Roman";
        roll = 5;
    }

    // Method to display Students details
    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        Students Students = new Students();
        Students.display();
    }
}
