package DataStructures;

import java.util.HashMap;

public class MapIntro1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println();
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.put(68, "D");
        System.out.println(map.size());
        System.out.println(map.get(99));

        map.remove(97);

        if (map.containsKey(100)) {
            System.out.println("Map contains 100 ");
        } else {
            System.out.println("Map doesn't contain 100");
        }
    }
}

