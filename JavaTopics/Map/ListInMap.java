package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListInMap {

    public static void main(String [] args){

        List<Integer> list1 = new ArrayList<>(Arrays.asList(7,2,5,3,5,3));

        Map<String,List<Integer>> map = new HashMap<>();

        map.put("List", list1);

        System.out.print(map.get("List"));
    }

}
