package collections;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.put(1, "Uno");
        map.put(4, "Four");

        System.out.println("HashMap: " + map);

        String value = map.getOrDefault(5, "Five");
        System.out.println("Value for key 5: " + value);

        map.compute(3, (k, v) -> v + " Updated");
        System.out.println("Updated HashMap: " + map);

        map.remove(2, "Two");
        System.out.println("HashMap after remove operation: " + map);
    }
}
