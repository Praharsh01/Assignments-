class Vehicle {
    private double price;
    private String color;
    private String model;

    // Constructor to initialize attributes
    public Vehicle(double price, String color, String model) {
        this.price = price;
        this.color = color;
        this.model = model;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Vehicle Details:");
        System.out.println("Price: £" + price);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(25000.0, "Red", "Toyota Camry");

        car.display();
    }
}
