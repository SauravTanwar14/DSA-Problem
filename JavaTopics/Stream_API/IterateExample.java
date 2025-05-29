package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateExample {

    public static void main(String[] args) {
        Stream.iterate(1,element -> element+1)
        .filter(element->element%5==0)
        .limit(5)
        .forEach(System.out::println);  

    List<Integer> list = Arrays.asList(1,2,6,9,4,8,10);

    List<Integer> even = list.stream()
    .filter(i -> i%2==0)
    .collect(Collectors.toList());

    System.out.println(even);
    }
  
}
