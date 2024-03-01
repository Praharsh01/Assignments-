class Q5 {
    public static void main(String args[]) {
        int array[] = {5, 3, 9, 7, 1};
        
        int max = array[0];
        int secondMax = array[1];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }

        System.out.println("Second largest number in Array is: " + secondMax);
    }
}