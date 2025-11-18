public class EmployeeCopy {

    int id;
    String name;
    double salary;

    // Parameterized constructor
    EmployeeCopy(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Copy constructor
    EmployeeCopy(EmployeeCopy emp) {
        this.id = emp.id;
        this.name = emp.name;
        this.salary = emp.salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    // Main method
    public static void main(String[] args) {
        EmployeeCopy emp1 = new EmployeeCopy(1, "Alice", 50000);
        EmployeeCopy emp2 = new EmployeeCopy(emp1);

        System.out.println("Employee 1 Details:");
        emp1.display();
        System.out.println("\nEmployee 2 Details (Copy):");
        emp2.display();
    }
}
