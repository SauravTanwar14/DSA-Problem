package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ram");
        list.add("Shayam");
        list.add("Ram");
        list.add("Radhe");

        Iterator<String> itr=list.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
    }

}
