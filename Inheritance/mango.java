// fruit.java (parent class)

import java.util.Scanner;

class fruit {
    String name;
    String color;
    String taste;
    int quantity;

    public fruit(String name, String color, String taste, int quantity) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Fruit: " + name);
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Quantity: " + quantity);
    }
}

// mango.java (child class)
public class mango extends fruit {
    public mango(String name, String color, String taste, int quantity) {
        super(name, color, taste, quantity); // Call the fruit constructor
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the fruit: ");
        String name = sc.nextLine();
        System.out.println("Enter the color of the fruit: ");
        String color = sc.nextLine();
        System.out.println("Enter the taste of the fruit: ");
        String taste = sc.nextLine();
        System.out.println("Enter the quantity of the fruit: ");
        int quantity = sc.nextInt();
        sc.close();
        mango mango = new mango(name, color, taste, quantity);
        mango.display();

        
        
    }
}