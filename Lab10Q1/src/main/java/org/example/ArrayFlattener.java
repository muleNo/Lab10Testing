package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {
    public static int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return null;
        }
        List<Integer> flattenedList = new ArrayList<>();
        for (int[] subArray : inputArray) {
            for (int element : subArray) {
                flattenedList.add(element);
            }
        }
        int[] flattenedArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            flattenedArray[i] = flattenedList.get(i);
        }
        return flattenedArray;
    }
    public static void main(String[] args) {
        int[][] nestedArray = {{1, 3}, {0}, {4, 5, 9}};

        int[] flattenedArray = flattenArray(nestedArray);

        System.out.println(Arrays.toString(flattenedArray));
    }
}
