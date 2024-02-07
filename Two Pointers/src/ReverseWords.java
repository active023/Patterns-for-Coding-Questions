public class ReverseWords {
    //LC#151
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        boolean initateWord = false;
        int right = 0;
        for (int left = s.length() - 1; left >= 0; left--) {

            if (s.charAt(left) == ' ') {
                if (initateWord) {
                    sb.append(s, left + 1, right);
                    initateWord = false;

                }
                sb.append(' ');
            } else {
                if (!initateWord) {
                    initateWord = true;
                    right = left + 1;
                }
            }
        }
        return sb.toString();
    }

    public String reverse(String s, int left, int right) {
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            sb.append(s.charAt(right));
            right--;
        }
        return sb.toString();
    }
}
