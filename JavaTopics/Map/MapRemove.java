package Map;

import java.util.HashMap;

public class MapRemove {

    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "Two");
        map.put(3,"three");
        map.put(4,"four");

        System.out.println(map);

        map.remove(4);

        System.out.println(map);
    }

}
