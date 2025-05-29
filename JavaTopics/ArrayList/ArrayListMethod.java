package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();

        l1.add(0, 1);
        l1.add(1, 2);

        System.out.println(l1);

        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        System.out.println(l2);

        l1.addAll(1,l2);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        System.out.println(l1.get(3));

        l1.set(0, 5);
        System.out.println(l1);

        int index= l1.indexOf(5);
        System.out.println(
            "The first occurrence of 5 is at index "
            + index);

            int index2= l1.indexOf(2);
        System.out.println(
            "The first occurrence of 2 is at index "
            + index2);

            boolean isPresent = l1.contains(4);
            System.out.println("result "+isPresent);


            for(int i: l1){
                System.out.print(i+ " ");
            }





    }
}
