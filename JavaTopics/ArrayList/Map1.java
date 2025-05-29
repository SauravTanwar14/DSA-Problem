package ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1, "one");

        map.put(2, "Two");
        map.put(3, "Three");

        for(Map.Entry m:map.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());
        }

      
       
    }

}
