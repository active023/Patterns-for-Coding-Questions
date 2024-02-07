import java.util.HashMap;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int i = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Boolean> map = new HashMap<>();
        while (j < s.length()) {
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), true);
                max = Math.max(j - i + 1, max);
                j++;
            } else {
                while (s.charAt(i) != s.charAt(j)) {
                    map.remove(s.charAt(i));
                    i++;
                }
                map.remove(s.charAt(i));
                i++;
                map.put(s.charAt(j), true);
            }
        }

        if (max == Integer.MIN_VALUE) {
            return 0;
        }
        return max;
    }
}
