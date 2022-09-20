package javacurs.homework.course08.exercises.ex1;

public class Cosmetics extends Product {
    private String color;
    private int weight;

    public Cosmetics() {
        System.out.println("Calling Cosmetics() constructor");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Cosmetics(float price, String name, String description, int quantity, String color, int weight) {
        super(price, name, description, quantity);
        System.out.println("Calling Cosmetics(price, name, description, quantity, color, weight) constructor");
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void printMembers() {
        super.printMembers();
        System.out.print("Cosmetics printMembers(): ");
        System.out.print("Color is '" + color + "'");
        System.out.println(", Weight is " + weight);
        System.out.println("");
    }
}
