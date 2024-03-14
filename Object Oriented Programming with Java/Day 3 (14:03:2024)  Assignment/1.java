class WideningConversion {
    public static void main(String[] args) {
        int i = 10;
        double d = (double)i; // Widening conversion from int to double

        System.out.println("Original int value: " + i);
        System.out.println("Converted double value: " + d);
    }
}
