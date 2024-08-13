import java.util.Arrays;

public class PP6 {

    public static void find(int[] arr) {
        int zeros = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (i + zeros < length) {
                arr[i + zeros] = arr[i];
            }
            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < length) {
                    arr[i + zeros] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        find(arr);
        System.out.println(Arrays.toString(arr));
    }
}
