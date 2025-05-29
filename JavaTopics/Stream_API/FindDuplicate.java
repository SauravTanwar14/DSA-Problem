package Stream_API;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 3, 9, 1};

        //using hash set
        HashSet<Integer> set  = new HashSet<>();
        HashSet<Integer> duplicateNum  = new HashSet<>();

       for(int i : numbers){

        if(!set.add(i)){
            duplicateNum.add(i);
        }
       }

       System.out.println(" duplicate value" + duplicateNum);

       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i : numbers){

        map.put(i,map.getOrDefault(map,0)+1 );
       }

       System.out.println("Duplicate Elements: ");

       for(Map.Entry<Integer,Integer> enteEntry: map.entrySet()){

        if(enteEntry.getValue()>1){
            System.out.print(enteEntry.getKey()+" ");
        }
       }

       
    }

    

}
