package com.manipulation;

public class ArrayOperations {
    public static int[] insertElement(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index for insertion.");
            return arr;
        }

        int[] result = new int[arr.length + 1];
        int i = 0;
        for (; i < index; i++) {
            result[i] = arr[i];
        }
        result[i] = element;
        for (; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reversed[i] = arr[j];
        }
        return reversed;
    }
}

