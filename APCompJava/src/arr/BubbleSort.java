package arr;

import java.util.ArrayList;

public class BubbleSort {

    public static void sort(int[] input) {
        int n = input.length;
        for (int i = 0; i < n; i++){
            for (int j = n - 1; j > i; j--) {
                if (input[j] < input[j - 1]) {
                    // exchange
                    exch(input, j, j-1);
                }
            }
        }
    }

    public static void sortOptimized(int[] input) {
        int n = input.length;
        for (int i = 0; i < n; i++){
            int exchange = 0;
            for (int j = n - 1; j > i; j--) {
                if (input[j] < input[j - 1]) {
                    // exchange
                    exch(input, j, j-1);
                    exchange++;
                }
            }
            if (exchange == 0) break;
        }
    }

    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void runProgram() {
        int[] uniqueInts = ArrayUtils.genIntArrayWithUniqueElements(1000, 0, 1000000);
        System.out.println("Before sorting: ");
        ArrayUtils.printArrayElements(uniqueInts);
        sort(uniqueInts);

        long startTime = System.nanoTime();
        sort(uniqueInts);
        long stopTime = System.nanoTime();
        System.out.println("After sorting: ");
        ArrayUtils.printArrayElements(uniqueInts);
        System.out.println("Time taken to sort: " + (stopTime - startTime) + " ns");

        startTime = System.nanoTime();
        sortOptimized(uniqueInts);
        stopTime = System.nanoTime();
        System.out.println("Time taken to sort: " + (stopTime - startTime) + " ns");
    }
}
