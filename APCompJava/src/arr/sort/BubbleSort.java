package arr.sort;

import arr.ArrayUtils;
import oop.immutable.PhoneNumber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    private static <T extends Comparable<T>> void sortGeneric(T[] input) {
        int n = input.length;
        for (int i = 0; i < n; i++){
            int exchange = 0;
            for (int j = n - 1; j > i; j--) {
                if (compGeneric(input[j], input[j - 1]) < 0) {
                    // exchange
                    exchGeneric(input, j, j-1);
                    exchange++;
                }
            }
            if (exchange == 0) break;
        }
    }

    private static <T extends Comparable<T>> int compGeneric(T a, T b) {
        return a.compareTo(b);
    }

    private static <T extends Comparable<T>> void exchGeneric(T[] a, int i, int j) {
        T swap = a[i];
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

        PhoneNumber[] arrPhones = new PhoneNumber[4];
        arrPhones[0] = new PhoneNumber(619, 5185796);
        arrPhones[1] = new PhoneNumber(714, 2547852);
        arrPhones[2] = new PhoneNumber(548, 7898756);
        arrPhones[3] = new PhoneNumber(100, 5185796);

        System.out.println("Before sorting: ");
        ArrayUtils.printArrayElements(arrPhones);
        sortGeneric(arrPhones);
        System.out.println("After sorting: ");
        ArrayUtils.printArrayElements(arrPhones);
    }
}
