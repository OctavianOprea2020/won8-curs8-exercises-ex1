package javacurs.homework.course08.exercises.ex1;

public class Fridge extends Electronics {
    private float temperature;

    public Fridge() {
        System.out.println("Calling Fridge() constructor");
    }

    public Fridge(float price, String name, String description, int quantity, String type, int length, int width, int height, int weight, float temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        System.out.println("Calling Fridge(price, name, description, quantity, type, length, width, height, weight, temperature) constructor");
        this.temperature = temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }
    @Override
    public void printMembers() {
        super.printMembers();
        System.out.print("Fridge printMembers(): ");
        System.out.println("Temperature is " + temperature);
        System.out.println("");
    }
}
