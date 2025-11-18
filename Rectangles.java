public class Rectangles {

    double length;
    double width;

    // Constructor
    Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Main method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
