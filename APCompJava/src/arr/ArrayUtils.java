package arr;

import java.util.HashSet;
import java.util.Random;

public class ArrayUtils {
    public static int[] genIntArrayWithRandomElements(int arrLen, int low, int high) {
        int range = high - low;
        if (range <= arrLen) return null;
        int[] arr = new int[arrLen];
        Random random = new Random();
        for (int i = 0; i < arrLen; i++) {
            arr[i] = low + random.nextInt(range);
        }
        return arr;
    }

    public static int[] genIntArrayWithUniqueElements(int arrLen, int low, int high) {
        int range = high - low;
        if (range <= arrLen) return null;
        int[] arr = new int[arrLen];
        Random random = new Random();
        int randomVal = 0;
        HashSet<Integer> uniqueElementSet = new HashSet<>();
        for (int i = 0; i < arrLen; i++) {
            randomVal = low + random.nextInt(range);
            while (uniqueElementSet.contains(randomVal)) {
                randomVal = low + random.nextInt(range);
            }
            uniqueElementSet.add(randomVal);
            arr[i] = randomVal;
        }
        return arr;
    }

    public static int[] genIntArrayWithDuplicateElements(int arrLen, int dupCount, int low, int high) {
        if ((high - low) <= arrLen) return null;
        int[] uniqueElements = genIntArrayWithUniqueElements(arrLen/dupCount, low, high);
        System.out.println("Unique elements: ");
        ArrayUtils.printArrayElements(uniqueElements);
        int[] duplicateElement = new int[arrLen];
        int k = 0;
        for (int i = 0; i < uniqueElements.length; i++) {
            for (int j = 0; j < dupCount; j++) {
                duplicateElement[k] = uniqueElements[i];
                k++;
            }
        }
        return duplicateElement;
    }

    public static void printArrayElements(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static <T> void printArrayElements(T[] input) {
        for (T i : input) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
