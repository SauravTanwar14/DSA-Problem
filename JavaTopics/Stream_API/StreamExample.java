package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

      
      public static void main(String[] args) {
        
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Joe");

      List<String> filtername = names.stream().filter(e ->e.startsWith("J"))
      .map(String::toUpperCase).collect(Collectors.toList());

      System.out.println(filtername);

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

      int sum = numbers.stream().reduce(0, Integer::sum);

      System.out.println("Sum: " + sum);  // Output: 15

      }

}
