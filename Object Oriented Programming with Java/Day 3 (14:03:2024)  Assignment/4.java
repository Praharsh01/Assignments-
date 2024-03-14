class WideningConversion {
    public static void main(String[] args) {
        int intValue = 10;

        double doubleValue = (int)intValue;
        float floatValue = (int)intValue;
        boolean booleanValue = intValue != 0;
        String stringValue = Integer.toString(intValue);

        System.out.println("Widening conversion to double: " + doubleValue);
        System.out.println("Widening conversion to float: " + floatValue);
        System.out.println("Widening conversion to boolean: " + booleanValue);
        System.out.println("Widening conversion to String: " + stringValue);
    }
}
