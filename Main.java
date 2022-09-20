package javacurs.homework.course08.exercises.ex1;

public class Main {
    public static void main(String[] args) {
        // Product
        System.out.println("Product product1:");
        Product product1 = new Product();
        product1.printMembers();

        System.out.println("Product product1 (set values):");
        product1.setPrice(994.99f);
        product1.setName("iPhone");
        product1.setDescription("Mobile phone from Apple");
        product1.setQuantity(10);
        product1.printMembers();

        System.out.println("Product product2:");
        Product product2 = new Product(10f, "Cable", "iPhone cable", 20);
        product2.printMembers();

        // Cosmetics
        System.out.println("Cosmetics cosmetics1:");
        Cosmetics cosmetics1 = new Cosmetics();
        cosmetics1.printMembers();

        System.out.println("Cosmetics cosmetics2:");
        Cosmetics cosmetics2 = new Cosmetics(20f, "Garnier", "Shampoo", 50, "pink", 50);
        cosmetics2.printMembers();

        // Electronics
        System.out.println("Electronics electronics1:");
        Product electronics1 = new Electronics();
        electronics1.printMembers();

        System.out.println("Electronics electronics2:");
        Product electronics2 = new Electronics(10f, "Akai", "TV set", 10, "Import", 150, 15, 50, 25);
        electronics2.printMembers();

        // Fridge
        System.out.println("Fridge fridge1:");
        Fridge fridge1 = new Fridge();
        fridge1.printMembers();

        System.out.println("Fridge fridge2:");
        Fridge fridge2 = new Fridge(10f, "Arctic", "Fridge", 30, "Romanian", 60, 50, 150, 100, -10);
        fridge2.printMembers();
    }
}
