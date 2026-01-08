package CP;
import java.util.LinkedHashMap;
import java.util.Map;
/*
* Problem:LRU Cache
* Solution:https://leetcode.com/problems/lru-cache/submissions/1878430014/?envType=problem-list-v2&envId=linked-list
*/
public class Problem1 {
    private final int capacity;
    private final Map<Integer, Integer> map;
//help taken

    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.capacity = capacity;
        this.map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        Integer value = map.get(key);
        return value == null ? -1 : value;
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}
