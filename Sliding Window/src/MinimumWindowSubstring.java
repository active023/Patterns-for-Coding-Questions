import java.util.HashMap;

public class MinimumWindowSubstring {


    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> tFrq = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tFrq.put(t.charAt(i), tFrq.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0;
        int formed = 0;
        int minLength = Integer.MIN_VALUE;
        int minLeft = 0;
        HashMap<Character, Integer> current = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            current.put(c, current.getOrDefault(c, 0) + 1);
            if (tFrq.containsKey(c) && tFrq.get(c).intValue() == current.get(c).intValue()) {
                formed++;
            }
            while (left <= right && formed == tFrq.size()) {
                c = s.charAt(left);
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }
                current.put(c, current.getOrDefault(c, 0) - 1);
                if (tFrq.containsKey(c) && current.get(c).intValue() < tFrq.get(c).intValue()) {
                    formed--;
                }
                left++;
            }
        }
        return minLength == Integer.MIN_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}
