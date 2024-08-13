public class P4 {
    public static String substring(String s, int start) {
        String result = "";
        for (int i = start; i < s.length(); i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static int findSubstring(String s, String t) {

        String curr = "";
        int n = s.length();
        int l = t.length();

        for (int i = 0; i < l; i++) {
            curr += s.charAt(i);
        }
        if (curr.equals(t))
            return 0;
        for (int i = l; i < n; i++) {
            curr = substring(curr, 1);
            curr += s.charAt(i);
            if (curr.equals(t))
                return i - l + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "thistest123string123";
        String t = "str";

        System.out.println(findSubstring(s, t));
    }
}
