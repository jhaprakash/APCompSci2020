package arr;

public class FindElements {

    public static int findNegatives(int[] input) {
        int count = 0;
        for (int i : input) {
            if (i < 0)  count++;
        }
        return count;
    }

    public static int findDuplicateElement(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i+1]) return input[i];
        }
        return -1;
    }

    public static int findNonDuplicateElement(int[] input) {
        for (int i = 0; i < input.length - 1; i += 2) {
            if (input[i] != input[i+1]) return input[i];
        }
        return -1;
    }

    public static int findMinInt(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int findMaxInt(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)    max = i;
        }
        return max;
    }
}
