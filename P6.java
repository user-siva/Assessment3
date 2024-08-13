import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 0, 4, 5, 0, 7, 8, 9 };
        int[] res = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k < arr.length) {
                if (arr[i] == 0) {
                    k += 2;
                } else {
                    res[k] = arr[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
