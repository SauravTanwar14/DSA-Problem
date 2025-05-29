import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    
    public static void main(String[] args) {
        
        //create a list and filter all even number
        List<Integer> list1 = List.of(2,4,50,21,23,22,67);

        //using stream
        Stream<Integer> stream = list1.stream();

        List<Integer> newList =
        stream.filter(i -> i%2 ==0).collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i>10).collect(Collectors.toList());
        System.out.println(newList1);

    }
}
