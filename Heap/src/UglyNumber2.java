import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class UglyNumber2 {

    HashMap<Integer, Boolean> map = new HashMap<>();

    public int nthUglyNumber(int n) {
        Queue<Integer> queue = new PriorityQueue<>((e1, e2) -> e2.intValue() - e1.intValue());
        queue.offer(1);
        int i = 2;
        while (queue.size() != n) {
            if (isPrimeFactors(i)) {
                queue.offer(i);
            }
            i++;
        }
        return queue.peek();
    }

    private boolean isPrimeFactors(int i) {
        while (i != 1) {
            if (map.containsKey(i)) {
                return map.get(i);
            }
            if (i % 2 == 0) {
                i = i / 2;
            } else if (i % 3 == 0) {
                i = i / 3;
            } else if (i % 5 == 0) {
                i = i / 5;
            } else {
                map.put(i, false);
                return false;
            }
        }
        map.put(i, true);
        return true;
    }
}

