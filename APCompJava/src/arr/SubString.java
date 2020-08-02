package arr;

public class SubString {

    public static int isSubString(String source, String subStr) {
        int N = source.length();
        int M = subStr.length();

        for (int i = 0; i <= N - M ; i++) {
            int j = 0;
            int k = i;
            while (j < M && (subStr.charAt(j) == source.charAt(k))) {
                j++;
                k++;
            }
            if (j == M)
                return i;
        }
        return -1;
    }
}
