public class minimumLength {

    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                int tmpLeft = left;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                }
                while (tmpLeft < right && s.charAt(tmpLeft) == s.charAt(right)) {
                    right++;
                }
            } else {
                break;
            }
        }
        return Math.max((right + 1 - left), 0);
    }
}
