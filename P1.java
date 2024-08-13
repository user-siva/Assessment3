
public class P1 {
    public static void find(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int maxi = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                if (arr[i + j] > maxi)
                    maxi = arr[i + j];
            }
            System.out.println(maxi);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int k = 3;
        find(arr, k);
    }
}