public class MaxValueFinder {

    public static <T extends Comparable<T>> T findMax(T[] elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        T max = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 3, 1, 7, 4, 5, 2 };
        Double[] doubleArray = { 3.5, 1.2, 7.9, 4.1, 5.6, 2.8 };

        Integer maxInt = findMax(intArray);
        Double maxDouble = findMax(doubleArray);

        System.out.println("Maximum Integer: " + maxInt);
        System.out.println("Maximum Double: " + maxDouble);
    }
}

