package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapContains {

     public static List<Integer> find_missing(List<Integer> arr) {
         Map<Integer,Integer> map = new HashMap<>();

         int repeating=-1; int missing=-1;
        
         for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        
        for (int i = 1; i <= arr.size(); i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    repeating = i;
                }
            } else {
                missing = i;
            }
        }
        
        
        return Arrays.asList(repeating,missing);

    }
     

    public static void main(String[] args) {
        
    // HashMap<Integer,String> map = new HashMap<>();

    // map.put(1, "one");
    // map.put(2, "Two");
    // map.put(3,"three");
    // map.put(4,"four");

    // System.out.println("is 4 persent in map "+map.containsKey(4));

    // System.out.println("is 5 persent in map "+map.containsKey(5));

    //System.out.println("is 5 persent in map "+map.ge);
    List<Integer> arr = Arrays.asList(3, 1, 3);
    List<Integer> result = find_missing(arr);
    System.out.println("Repeating number: " + result.get(0));
    System.out.println("Missing number: " + result.get(1));
    
    }
}
