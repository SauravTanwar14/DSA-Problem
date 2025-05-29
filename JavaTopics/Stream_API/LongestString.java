package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("apple","banana","cherry","date","grapefruit");
        Optional<String> longestString = list.stream()
        .max(Comparator.comparingInt(String::length));
        System.out.println(longestString);
    }
}
