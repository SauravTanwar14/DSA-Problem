package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();

        al.add("Mango");
        al.add("grapes");
        al.add("banana");
        al.add("apple");

        //printing list
        System.out.println(al);

        //printing using iterator
        System.out.println("through iterator : ");
        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //print using forloop
        System.out.println("using for each loop : ");
        for(String list:al){
            System.out.println(list);
        }

        //get and set method
        System.out.println(" ");
        System.out.println("get method : ");
        System.out.println(al.get(2));

        System.out.println(" ");
        System.out.println(al);
        System.out.println("set method : ");
        al.set(1,"Anjir");
        System.out.println(al);
    }

}
