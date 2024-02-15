public class MaxVowels {

    public static void main(String[] args) {
        System.out.println(new MaxVowels().maxVowels("leetcode", 3));
    }

    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int count = 0;
        while (sb.length() < k) {
            sb.append(s.charAt(i));
            if (vowels.contains(s.charAt(i) + "")) {
                count++;

            }
            i++;
        }

        int runningCount = count;

        for (int j = i; j < s.length(); j++) {
            if (count >= k) {
                return count;
            }
            sb.append(s.charAt(j));
            if (vowels.contains(s.charAt(j) + "")) {
                runningCount++;
            }
            if (vowels.contains(sb.charAt(0) + "")) {
                runningCount--;
            }
            sb.deleteCharAt(0);
            count = Math.max(count, runningCount);
        }
        return count;
    }
}
