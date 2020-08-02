package arr;

public class ChangeOrder {

    private static void rotateElements(int[] input, int count, boolean rotateRight) {
        int rotate = count % input.length;
        if (rotateRight)    rotate = input.length - rotate;
        int[] temp = new int[input.length];
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            index = rotate++ % input.length;
            temp[i] = input[index];
        }

        for (int i = 0; i < temp.length; i++) {
            input[i] = temp[i];
        }
    }

    public static void rotateElementsLeft(int[] input, int count) {
//        int rotate = count % input.length;
//        int[] temp = new int[input.length];
//        int index = 0;
//
//        for (int i = 0; i < temp.length; i++) {
//            index = rotate++ % input.length;
//            temp[i] = input[index];
//        }
//
//        for (int i = 0; i < temp.length; i++) {
//            input[i] = temp[i];
//        }
        rotateElements(input, count, false);
    }

    public static void rotateElementsRight(int[] input, int count) {
//        int rotate = count % input.length;
//        rotate = input.length - rotate;
//        int[] temp = new int[input.length];
//        int index = 0;
//
//        for (int i = 0; i < temp.length; i++) {
//            index = rotate++ % input.length;
//            temp[i] = input[index];
//        }
//
//        for (int i = 0; i < temp.length; i++) {
//            input[i] = temp[i];
//        }
        rotateElements(input, count, true);
    }

    public static void reverseOrder(int[] input) {
        int i = 0;
        int j = input.length - 1;
        int temp;
        while (i < j) {
            temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }
    }
}
