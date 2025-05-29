
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {

    
        
        public static void main(String args[]){
        
         List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19,20);

         List<Integer> evenNumber = list.stream()
         .filter(x -> x%2 ==0)
         .collect(Collectors.toList());

         System.out.println("even number list "+evenNumber);

         List<Integer> square = evenNumber.stream()
         .map(x -> x*x)
         .collect(Collectors.toList());

         System.out.println(square);

         List<Integer> squareSum = evenNumber.stream()
         .map(x -> x+x)
         .collect(Collectors.s);

         System.out.println(squareSum);



        


        
        }
}
