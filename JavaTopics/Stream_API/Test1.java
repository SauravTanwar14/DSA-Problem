package Stream_API;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(5, 10, 20, 30, 8, 7);

        l.stream()
        .filter(x->x%2==0)
        .filter(x->x>10)
        .forEach(System.out::println);

        int arr[] = {30, 20, 10};

        int sum=Arrays.stream(arr).sum();
        System.out.println(sum);

        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        //Print first n natural numbers with given digit d.
        Stream.iterate(1, x -> x + 1)
              .filter(x -> x.toString().contains("5"))
              .limit(10)
              .forEach(System.out::println);

              String ar[] = {"abc", "cde", "acd", 
              "aec", "xyz"};

              Arrays.stream(ar)
              .filter(x->x.startsWith("a"))
              .filter(x->x.endsWith("c"))
              .sorted()
              .forEach(System.out::println);
    }
}
