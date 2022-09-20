package javacurs.homework.course08.exercises.ex1;

public class Electronics extends Product {
    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;

    public Electronics() {
        System.out.println("Calling Electronics() constructor");
    }

    public Electronics(float price, String name, String description, int quantity, String type, int length, int width, int height, int weight) {
        super(price, name, description, quantity);
        System.out.println("Calling Electronics(price, name, description, quantity, type, length, width, height, weight) constructor");
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public void printMembers() {
        super.printMembers();
        System.out.print("Electronics printMembers(): ");
        System.out.print("Type is '" + type + "'");
        System.out.print(", Length is " + length);
        System.out.print(", Width is " + width);
        System.out.print(", Height is " + height);
        System.out.println(", Weight is " + weight);
        System.out.println("");
    }
}
