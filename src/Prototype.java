class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}

public class Prototype {
    public static void main(String[] args) {
        try {
            Product originalProduct = new Product("Laptop", 999.99);
            System.out.println("Original: " + originalProduct);

            Product clonedProduct = originalProduct.clone();
            System.out.println("Cloned: " + clonedProduct);

            clonedProduct = new Product("Laptop Pro", 1299.99);
            System.out.println("Modified Cloned: " + clonedProduct);

            System.out.println("Original After Modification: " + originalProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
