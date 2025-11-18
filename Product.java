public class Product {

    int id;
    String name;
    double price;
    int quantity;

    // Constructor
    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total stock value
    void totalStockValue() {
        double totalValue = price * quantity;
        System.out.println("Total stock value of " + name + " (ID: " + id + "): " + totalValue);
    }

    // Method to display product details
    void displayProductList() {
        System.out.println("Product ID: " + id +
                           ", Name: " + name +
                           ", Price: " + price +
                           ", Quantity: " + quantity);
    }

    // Main method
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 800.0, 10);
        Product product2 = new Product(2, "Smartphone", 500.0, 20);

        product1.displayProductList();
        product1.totalStockValue();

        product2.displayProductList();
        product2.totalStockValue();
    }
}
