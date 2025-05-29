package ArrayList;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet<String> al = new TreeSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }
        
        System.out.println("Traversing element through Iterator in descending order");  

        Iterator<String> it = al.descendingIterator();
        while(it.hasNext()){  
            System.out.println(it.next());  
           }

    }

}
