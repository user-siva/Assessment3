public class P2 {
    public static String add(String a, String b, int base) {
        String res = "";

        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            res = (sum % base) + res;
            carry = sum / base;

        }

        return res;
    }

    public static void main(String[] args) {
        int a = 1010;
        int b = 11001;
        int base = 2;
        String l = String.valueOf(a);
        String m = String.valueOf(b);
        // add(l, m, base);
        System.out.println(add(l, m, base));
    }
}
