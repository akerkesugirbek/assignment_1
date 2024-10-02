// Product class implementing Cloneable
class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Override clone method
    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    // Override toString method for display
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}

// Test class
public class Prototype {
    public static void main(String[] args) {
        try {
            // Create an original product
            Product originalProduct = new Product("Laptop", 999.99);
            System.out.println("Original: " + originalProduct);

            // Clone the original product
            Product clonedProduct = originalProduct.clone();
            System.out.println("Cloned: " + clonedProduct);

            // Modify the cloned product
            clonedProduct = new Product("Laptop Pro", 1299.99); // Update the name and price
            System.out.println("Modified Cloned: " + clonedProduct);

            // Original product remains unchanged
            System.out.println("Original After Modification: " + originalProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
