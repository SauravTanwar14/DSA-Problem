package Stream_API;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOccurrence {

    public static void main(String[] args) {
        
        String input ="Hello world";

        Map<Character,Long> charCountMap = input.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(
            c -> c,
            Collectors.counting()
        ));

        // Print the result
        charCountMap.forEach((character, count) ->
                System.out.println("Character: " + character + ", Count: " + count));

    }
}
