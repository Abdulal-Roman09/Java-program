import java.util.Scanner;

public class Employee {

    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = cin.nextInt();
        cin.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = cin.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = cin.nextDouble();

        Employee emp = new Employee(id, name, salary);

        System.out.println("\nEmployee Details:");
        emp.display();
    }
}
