package arr;

public class SumAndAvg {

    public static int calculateSum(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }

    public static double calculateAverage(int[] input) {
        return (double)calculateSum(input)/input.length;
    }
}
