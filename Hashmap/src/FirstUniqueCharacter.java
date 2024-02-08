import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    //LC387
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }

        int idx = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> keySet : map.entrySet()) {
            if (keySet.getValue() != -1) {
                idx = Math.min(keySet.getValue(), idx);
            }
        }
        return idx == Integer.MAX_VALUE ? -1 : idx;
    }

}
