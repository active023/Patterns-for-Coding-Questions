import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

    //LC567
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }


        HashMap<Character, Integer> s1FreqMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1FreqMap.put(c, s1FreqMap.getOrDefault(c, 0) + 1);
        }


        HashMap<Character, Integer> s2FreqMap = new HashMap<>();
        int i = 0;
        int j = 0;

        while (j < s2.length()) {
            s2FreqMap.put(s2.charAt(j), s2FreqMap.getOrDefault(s2.charAt(j), 0) + 1);

            if (j - i + 1 == s1.length()) {
                if (match(s1FreqMap, s2FreqMap)) {
                    return true;
                }
            }

            if (j - i + 1 >= s1.length()) {
                s2FreqMap.put(s2.charAt(i), s2FreqMap.getOrDefault(s2.charAt(i), 0) - 1);
                i++;
            }
            j++;
        }
        return false;
    }

    public boolean match(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() - map2.getOrDefault(entry.getKey(), 0) != 0) {
                return false;
            }
        }
        return true;
    }
}
