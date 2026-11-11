
import java.util.*;

class Product implements Comparable<Product> {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Product p) {
        int result = Double.compare(this.price, p.price);

        if (result == 0) {
            return Integer.compare(this.id, p.id);
        }

        return result;
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

public class Q10_04 {
    public static void main(String[] args) {

        TreeSet<Product> products = new TreeSet<>();

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Mobile", 20000));
        products.add(new Product(3, "Mouse", 500));
        products.add(new Product(4, "Keyboard", 1500));
        products.add(new Product(5, "Tablet", 25000));

        System.out.println("Products Sorted By Price:");

        for (Product p : products) {
            p.display();
        }
    }
}
