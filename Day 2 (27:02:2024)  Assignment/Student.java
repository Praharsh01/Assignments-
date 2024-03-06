class Student {
    private String name;
    private int[] marks;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.marks = new int[3]; // Initializing marks array for three subjects
    }

    // Function to assign initial values (marks)
    public void assignMarks(int[] marks) {
        if (marks.length != 3) {
            System.out.println("Error: Marks should be provided for three subjects.");
            return;
        }
        this.marks = marks;
    }

    // Function to compute total average
    public double computeTotalAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;
        return average;
    }

    // Function to display student's name and total marks
    public void displayInfo() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks Obtained: " + totalMarks);
    }
}

public class Main {
    public static void main(String[] args) {
        
	Student student1 = new Student("John Doe");

        int[] marks = {85, 90, 95};
        student1.assignMarks(marks);

        student1.displayInfo();
    }
}
