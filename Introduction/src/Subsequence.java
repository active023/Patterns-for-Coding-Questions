public class Subsequence {

    public boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            char c = t.charAt(i);
            if (c == s.charAt(j)) {
                j++;
            }
        }

        return j == s.length();
    }
}
