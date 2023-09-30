package org.example;

public class Main {
    public static void main(String[] args) {
        // Mocking ArrayFlattenerService in main method
        ArrayFlattenerService arrayFlattenerService = new ArrayFlattenerService() {
            @Override
            public int[] flattenArray(int[][] a_in) {
                if (a_in == null) return null;

                int size = 0;
                for (int[] array : a_in) {
                    size += array.length;
                }
                int[] flatArray = new int[size];
                int index = 0;
                for (int[] array : a_in) {
                    for (int element : array) {
                        flatArray[index++] = element;
                    }
                }
                return flatArray;
            }
        };

        // Creating ArrayReversor object with mocked service
        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattenerService);

        // Example Usage
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] reversedArray = arrayReversor.reverseArray(inputArray);

        // Print reversed array
        if (reversedArray != null) {
            for (int element : reversedArray) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("The reversed array is null");
        }
    }
}

