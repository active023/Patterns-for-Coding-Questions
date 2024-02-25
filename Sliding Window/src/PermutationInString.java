import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PermutationInString {

    public static void main(String[] args) {
        System.out.println(new PermutationInString().checkInclusion("ab", "eidbaooo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> s1Freq = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Freq.put(s1.charAt(i), s1Freq.getOrDefault(s1.charAt(i), 0) + 1);
        }
        Map<Character, Integer> current = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            current.put(s2.charAt(right), current.getOrDefault(s2.charAt(right), 0) + 1);
            while (right - left + 1 >= s1.length()) {
                if (right - left + 1 == s1.length() && isMapEqual(current, s1Freq)) {
                    return true;
                } else {
                    current.put(s2.charAt(left), current.getOrDefault(s2.charAt(left), 0) - 1);
                    left++;
                }
            }
        }
        return false;
    }

    private boolean isMapEqual(Map<Character, Integer> current, Map<Character, Integer> s1Freq) {
        for (Map.Entry<Character, Integer> entry : current.entrySet()) {
            if (!Objects.equals(s1Freq.getOrDefault(entry.getKey(), 0), entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}
