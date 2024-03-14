class ArithmeticOperations {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.5;
        float floatValue = 3.3f;

        // Addition
        double resultAdd = (double)intValue + doubleValue + (double)floatValue;
        // Subtraction
        double resultSubtract = doubleValue - (double)intValue - (double)floatValue;
         // Multiplication
        double resultMultiply = (double)intValue * doubleValue * (double)floatValue;
         // Division
        double resultDivide = doubleValue / (double)intValue / (double)floatValue;

        System.out.println("Result of addition: " + resultAdd);
        System.out.println("Result of subtraction: " + resultSubtract);
        System.out.println("Result of multiplication: " + resultMultiply);
        System.out.println("Result of division: " + resultDivide);
    }
}
