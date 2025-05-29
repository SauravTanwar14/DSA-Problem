package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> set = new ArrayList<>();
          
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
    }
    }
}
