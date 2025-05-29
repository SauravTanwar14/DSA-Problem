package Stream_API;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveCharFromString {

    public static void main(String[] args) {
        
        String str ="Hello world";
        char charToRemove ='o';

        String result = str.chars()
        .filter(c -> c != charToRemove)
        .mapToObj(c -> String.valueOf((char)c))
        .collect(Collectors.joining());

        System.out.println("Original String: " + str);
        System.out.println("String after removal: " + result);
    }
}
