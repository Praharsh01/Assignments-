import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Using if-else
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year (if-else).");
        } else {
            System.out.println(year + " is not a leap year (if-else).");
        }
        
        // Using switch-case
        int remainder = year % 4;
        switch (remainder) {
            case 0:
                if (year % 100 == 0) {
                    remainder = year % 400;
                    switch (remainder) {
                        case 0:
                            System.out.println(year + " is a leap year (switch-case).");
                            break;
                        default:
                            System.out.println(year + " is not a leap year (switch-case).");
                            break;
                    }
                } else {
                    System.out.println(year + " is a leap year (switch-case).");
                }
                break;
            default:
                System.out.println(year + " is not a leap year (switch-case).");
                break;
        }
        
        scanner.close();
    }
}
