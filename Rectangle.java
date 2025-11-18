public class Rectangle {

    double length;
    double breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }

    // Main method
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
