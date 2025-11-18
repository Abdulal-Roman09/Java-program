public class Employee {

    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double da;

    // Constructor
    public Employee(int id, String name, double basicSalary, double hra, double da) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 50000, 10000, 5000);
        emp.displayDetails();
    }
}
