import arr.*;
import arr.sort.*;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        Random random = new Random();
        int randomIndex = -1;
        System.out.println("Substring found at index: " +
                SubString.isSubString("Hello world", "world"));
        int[] intArray = ArrayUtils.genIntArrayWithRandomElements(20, -100, 100);
        System.out.println("Input array: ");
        ArrayUtils.printArrayElements(intArray);
        System.out.println("\nMin value: " + FindElements.findMinInt(intArray));
        System.out.println("Max value: " + FindElements.findMaxInt(intArray));
        System.out.println("Sum: " + SumAndAvg.calculateSum(intArray));
        System.out.println("Average: " + SumAndAvg.calculateAverage(intArray));

        int[] uniqueInts = ArrayUtils.genIntArrayWithUniqueElements(10, 0, 100);
        System.out.println("Unique int array: ");
        ArrayUtils.printArrayElements(uniqueInts);
        randomIndex = random.nextInt(uniqueInts.length - 1);
        uniqueInts[randomIndex] = uniqueInts[randomIndex + 1];
        System.out.println("Array after 1 duplication: ");
        ArrayUtils.printArrayElements(uniqueInts);
        System.out.println("Duplicate element is: " + FindElements.findDuplicateElement(uniqueInts));

        int[] twoDuplicates = ArrayUtils.genIntArrayWithDuplicateElements(10, 2, 0, 100);
        System.out.println("Int array with two duplicates: ");
        ArrayUtils.printArrayElements(twoDuplicates);
        randomIndex = random.nextInt(twoDuplicates.length);
        twoDuplicates[randomIndex] = randomIndex;
        System.out.println("Array with non duplicates: ");
        ArrayUtils.printArrayElements(twoDuplicates);
        System.out.println("Non-duplicate element is: " + FindElements.findNonDuplicateElement(twoDuplicates));

        uniqueInts = ArrayUtils.genIntArrayWithUniqueElements(10, 0, 100);
        System.out.println("Array before rotation: ");
        ArrayUtils.printArrayElements(uniqueInts);
        System.out.println("Array after rotating left by 2 places: ");
        ChangeOrder.rotateElementsLeft(uniqueInts, 2);
        ArrayUtils.printArrayElements(uniqueInts);

        System.out.println("Array after rotating right by 2 places: ");
        ChangeOrder.rotateElementsRight(uniqueInts, 2);
        ArrayUtils.printArrayElements(uniqueInts);

        System.out.println("Array after reversing order: ");
        ChangeOrder.reverseOrder(uniqueInts);
        ArrayUtils.printArrayElements(uniqueInts);

        BubbleSort.runProgram();

        Selection.runAlgo();
        Insersion.runAlgo();
        MergeSort.runAlgo();
        QuickSort.runAlgo();
    }
}
