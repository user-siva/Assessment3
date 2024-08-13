import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 2, 2, 2 };
        int n = arr.length;
        int[] freq = new int[500];
        int t = n / 2, pairs = 0;

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
            if (freq[arr[i]] == 2) {
                pairs++;
                freq[arr[i]] = 0;
            }
        }

        System.out.println(pairs == t);

    }
}
