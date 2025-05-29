package Stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void squareSum(){
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sumOfSquares = arr.stream()
        .filter(x->x%2==0)
        .map(x->x*x)
        .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
    public static void main(String[] args) {
        squareSum();



    }
}
