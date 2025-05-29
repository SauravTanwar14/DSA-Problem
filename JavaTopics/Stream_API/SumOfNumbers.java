package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //even number
        List<Integer> evenNumber = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumber);

        //square of even number
        List<Integer> squareEvenNumber = numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e*e)
                .collect(Collectors.toList());
        System.out.println(squareEvenNumber);

        //sum of square of even number
        int sum =squareEvenNumber.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

        //average of square of even number
        int average = squareEvenNumber.stream()
                         .reduce(0, Integer::sum) / squareEvenNumber.size();

        System.out.println("Average: " + average);

        //square of number greater than 5
        List<Integer> temp = numbers.stream()
                .filter(e -> e>=5)
                .map(e -> e*e)
                .collect(Collectors.toList());

        System.out.println(temp);

        //first even number
        Optional<Integer> firstEvenNumber = numbers.stream()
                .filter(e -> e % 2 == 0)
                .findFirst();

        System.out.println(firstEvenNumber.get());


    }
}
