package recursion;

public class Factorial {

    public static int findFactorial(int num) {
        if (num == 0)   return 1;
        return num * findFactorial(num - 1);
    }
}
