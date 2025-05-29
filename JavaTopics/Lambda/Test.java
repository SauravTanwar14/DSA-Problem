package Lambda;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach(n->System.out.print(n+" "));

        System.out.println("even numbers");
        
        list.forEach(n->{
            if(n%2==0){
                System.out.print(n+" ");
            }
        });


    }
}
