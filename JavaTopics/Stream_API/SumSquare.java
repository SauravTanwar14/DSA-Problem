package Stream_API;

import java.util.*;
public class SumSquare {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sumSquare = list.stream()
        .filter(x->x%2==0)
        .mapToInt(x->x*x)
        .sum();

        System.out.println(sumSquare);

    }
}
