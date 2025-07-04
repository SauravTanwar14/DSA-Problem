package DP;

import java.util.*;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7);
        Set<Integer> set = new HashSet<>();

        List<Integer> result = numbers.stream()
                .filter(num-> !set.add(num))
                .collect(Collectors.toList());

        System.out.println(result);

        Map<Integer ,Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ));
        List<Integer> duplicates = frequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);







    }
}
