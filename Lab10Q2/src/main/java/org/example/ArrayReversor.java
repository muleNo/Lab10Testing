package org.example;

import java.util.Arrays;

public class ArrayReversor {

    private final ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }

        int[] flattenedArray = flattenerService.flattenArray(inputArray);
        if (flattenedArray == null) {
            return null;
        }

        int start = 0, end = flattenedArray.length - 1;
        while (start < end) {
            int temp = flattenedArray[start];
            flattenedArray[start] = flattenedArray[end];
            flattenedArray[end] = temp;
            start++;
            end--;
        }
        return flattenedArray;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}