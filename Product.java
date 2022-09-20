package javacurs.homework.course08.exercises.ex1;

public class Product {
    private float price;
    private String name;
    private String description;
    private int quantity;

    public Product() {
        System.out.println("calling Product() constructor");
    }

    public Product(float price, String name, String description, int quantity) {
        System.out.println("calling Product(price, name, description, quantity) constructor");
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printMembers() {
        System.out.print("Product printMembers(): ");
        System.out.print("Price is " + price);
        System.out.print(", Name is '" + name + "'");
        System.out.print(", Description is '" + description + "'");
        System.out.println(", Quantity is " + quantity);
        System.out.println("");
    }
}
