import com.manipulation.ArrayOperations;

public class ArrayMain {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 6;
        int insertionIndex = 2;

        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] newArray = ArrayOperations.insertElement(originalArray, elementToInsert, insertionIndex);

        System.out.println("Array after insertion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] reversedArray = ArrayOperations.reverseArray(newArray);

        System.out.println("Reversed Array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

