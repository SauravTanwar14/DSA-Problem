package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PositiveNUmber {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,-2,-3,4,5,6,-7,-8);

        boolean postiveAll = number.stream().allMatch(e -> e >0);

        System.out.println("All number is positive "+postiveAll);

        List<String> sentences = List.of(
                "Java is awesome",
                "Spring Boot makes Java development easy",
                "Java and Spring are powerful"
        );

        // Split each string into words, flatten them, and collect unique words
        Set<String> uniqueWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+"))) // Split into words
                .map(String::toLowerCase) // Convert to lowercase to avoid case sensitivity
                .collect(Collectors.toSet()); // Collect unique words

        System.out.println("Unique words count: " + uniqueWords.size());
        System.out.println("Unique words: " + uniqueWords);
    }
}
