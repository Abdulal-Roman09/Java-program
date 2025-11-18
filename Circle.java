public class Circle {

    double radius;

    // Constructor for integer radius
    Circle(int radius) {
        this.radius = radius;
    }

    // Constructor for double radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Main method
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(7.5);

        System.out.println("Area of circle with integer radius: " + circle.area());
        System.out.println("Area of circle with double radius: " + circle1.area());
    }
}
