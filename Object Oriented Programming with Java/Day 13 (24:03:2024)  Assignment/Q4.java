class Q4 {
    public static void main(String[] args) {
   
    int[] numbers = {10, 0};
        
        try {
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    
    }
}