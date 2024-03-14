import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numerical grade: ");
        int grade = scanner.nextInt();
        
        if (grade >= 90 && grade <= 100) {
            System.out.println("Letter Grade: A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Letter Grade: B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Letter Grade: C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Letter Grade: D");
        } else if (grade >= 0 && grade < 60) {
            System.out.println("Letter Grade: F");
        } else {
            System.out.println("Invalid grade entered.");
        }
        
        scanner.close();
    }
}
