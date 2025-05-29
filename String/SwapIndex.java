package String;

import java.util.ArrayList;
import java.util.List;

public class SwapIndex {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println("Before list "+list);

        swapElements(list,2,4);

        System.out.println("After list "+list);
    }

    private static void swapElements(List<String> list, int i, int j) {
        
        String temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }
}
