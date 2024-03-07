import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {

    List<Integer> list = new LinkedList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    int capacity = 0;

    public LRUCache(int _capacity) {
        this.capacity = _capacity;
    }

    public int get(int key) {
        int index = map.getOrDefault(key, -1);
        if (index != -1) {
            int result = list.remove(index);
            list.add(result);
            return result;
        }
        return -1;
    }

    public void put(int key, int value) {
        int index = map.getOrDefault(key, -1);
        if (index == -1) {
            if (map.size() < capacity) {
                list.add(value);
                map.put(key, list.size() - 1);
            } else {
                int first = list.removeFirst();
                map.remove(first);
                list.add(value);
                map.put(key, list.size() - 1);
            }
        } else {
            if (map.size() < capacity) {
                list.remove(index);
                list.add(value);
                map.put(key, list.size() - 1);
            } else {
                int removed = list.remove(index);
                map.remove(removed);
                list.add(value);
                map.put(key, list.size() - 1);
            }

        }
    }
}
