import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
        }
        for (Character c : t.toCharArray()) {
            int count = map.getOrDefault(c, 0) - 1;
            map.put(c, count);
        }
        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            if (c.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
