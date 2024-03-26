import java.util.*;

class Q2 {

    static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int x = sc.nextInt();

        try {
            checkEven(x);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class OddNumberException extends Exception {
    //Constructor Call
    public OddNumberException(String message) {
        super(message);
    }
}
