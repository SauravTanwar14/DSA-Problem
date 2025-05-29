package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListItems{
    private Integer key;
    private String value;
    public ListItems(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
    public Integer getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

    
}
public class ListToMap {

    public static void main(String[] args) {
        
        // Creating a List of type ListItems using ArrayList
        List<ListItems> list = new ArrayList<ListItems>();
 
        // add the member of list
        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "Geeks"));
        list.add(new ListItems(4, "For"));
        list.add(new ListItems(5, "Geeks"));
 
        // Map which will store the list items
        Map<Integer, String> map = new HashMap<>();

        list.forEach(n -> {
            map.put(n.getKey(), n.getValue());
        });

        System.out.println("Map : " + map);
    }
}
