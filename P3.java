public class P3 {
    public static int findCount(int[] arr, int threshold) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > threshold) {
                count += (arr[i] / threshold);
                if ((arr[i] % threshold) != 0)
                    count++;
            } else {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 10, 13, 6, 2 };
        int threshold = 3;
        System.out.println(findCount(arr, threshold));
    }
}
