package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapFunction {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Alice", "Bob", "Charlie");

        List<Integer> nameLengths= name.stream()
        .map(String::length)
        .collect(Collectors.toList());

        System.out.println(nameLengths);
    }
}
