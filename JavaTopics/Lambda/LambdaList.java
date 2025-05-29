package Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaList {

    public static void main(String[] args) {
        
        List<Integer> al = Arrays.asList(10,20,30,40);

        //using lambda expression
        al.forEach(x->System.out.println(x));

        //using method refrence
        al.forEach(System.out::println);
}
}
