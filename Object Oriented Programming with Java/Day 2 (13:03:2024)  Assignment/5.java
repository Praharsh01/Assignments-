import java.util.Scanner;

class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Convert input character to lowercase for simplicity
        ch = Character.toLowerCase(ch);

        // Check if the input character is a letter
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid letter.");
        }

        scanner.close();
    }
}

