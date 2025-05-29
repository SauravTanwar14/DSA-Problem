package ArrayList;

import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add(null);

        System.out.println(set);
    }
}
