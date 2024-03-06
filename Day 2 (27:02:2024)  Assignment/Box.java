class Box {
    private double height;
    private double width;
    private double breadth;

    // Constructor with three parameters
    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Method to calculate volume
    public double getVolume() {
        return height * width * breadth;
    }

    // Method to calculate surface area
    public double getArea() {
        return 2 * (height * width + height * breadth + width * breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantiating two boxes with arbitrary dimensions
        Box box1 = new Box(5.0, 3.0, 4.0);
        Box box2 = new Box(2.5, 2.5, 2.5);

        // Printing volume and surface area of the first box
        System.out.println("Box 1:");
        System.out.println("Volume: " + box1.getVolume());
        System.out.println("Surface Area: " + box1.getArea());

        // Printing volume and surface area of the second box
        System.out.println("\nBox 2:");
        System.out.println("Volume: " + box2.getVolume());
        System.out.println("Surface Area: " + box2.getArea());
    }
}
