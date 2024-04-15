import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }

        sc.close();
    }

    // Function to check if a number is Perfect
    public static boolean isPerfect(int num) {
        int sum = 0;

        // Find all divisors and add them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is equal to the number itself
        return sum == num;
    }
}

