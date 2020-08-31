package arrlist;

import java.util.ArrayList;

public class LinearBinarySearch {

    public static int search(ArrayList<Integer> data, int target) {
        int start = 0;
        int end = data.size() - 1;
        int middle = 0;

        while (start <= end) {
            middle = (end + start)/2;
            if (target < data.get(middle)) {
                end = middle - 1;
            }
            else if (target > data.get(middle)) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static int searchRecursive(ArrayList<Integer> data, int find) {
        return searchRecursive(data, 0, data.size() - 1, find);
    }

    private static int searchRecursive(ArrayList<Integer> data, int low, int hi, int find) {
        if (low > hi)   return -1;
        int middle = (hi + low)/2;
        if (find < data.get(middle))    return searchRecursive(data, low, middle - 1, find);
        if (find > data.get(middle))    return searchRecursive(data, middle + 1, hi, find);
        return middle;
    }

    public static void run() {
        int search = 50;
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(50);
        data.add(60);
        data.add(70);
        data.add(80);
        data.add(90);

        System.out.println(search + " is present at index: " + search(data, search));
        System.out.println(search + " is present at index[recursive]: " + searchRecursive(data, search));
    }

}
