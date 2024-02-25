import java.util.HashSet;
import java.util.Set;

public class FindJudge {

    public int findJudge(int n, int[][] trust) {
        Set<Integer> set = new HashSet<>();
        for (int[] t : trust) {
            if (t[0] == n) {
                return -1;
            }
            if (t[1] == n) {
                set.add(t[0]);
            } else if (!set.contains(t[0])) {
                return -1;
            }
        }
        return n;
    }
}
