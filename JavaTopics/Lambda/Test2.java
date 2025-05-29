package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

interface Demo {

    void print(Integer p);

}

public class Test2 {

    static void fun(Demo t1, Integer p) {
        t1.print(p);
    }

    public static void main(String[] args) {

        fun(p -> System.out.println(p), 10);

        // sorting using lambda expression
        List<Integer> al = new ArrayList<>();

        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);

        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 0 : 1);
        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);

        TreeSet<Integer> h = new TreeSet<>((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 0: 1);

        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" + 
                                        " sorting are: " + h);

    }
}
