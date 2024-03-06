class Person {
    private int age;
    private double height;
    private double weight;

    // Constructor with all attributes
    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Constructor with age and height
    public Person(int age, double height) {
        this.age = age;
        this.height = height;
        this.weight = 0; // Default weight
    }

    // Constructor with age
    public Person(int age) {
        this.age = age;
        this.height = 0; // Default height
        this.weight = 0; // Default weight
    }

    // Method to display person details
    public void display() {
        System.out.println("Person Details:");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating multiple instances of Person class using different constructors
        Person person1 = new Person(30, 1.75, 70.5);
        Person person2 = new Person(25, 1.60);
        Person person3 = new Person(20);

        System.out.println("Person 1:");
        person1.display();

        System.out.println("\nPerson 2:");
        person2.display();

        System.out.println("\nPerson 3:");
        person3.display();
    }
}
