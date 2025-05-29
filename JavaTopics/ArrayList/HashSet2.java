package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");

        HashSet<String> set =new HashSet<>(list);
        set.add("Gaurav");

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
