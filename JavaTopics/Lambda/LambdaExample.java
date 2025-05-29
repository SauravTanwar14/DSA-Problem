package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void filter(List<String> names, Predicate<String> condition){
        
        for(String name:names){
            if(condition.test(name)){
                System.out.println(name+"");
            }
        }
    }

    public static void main(String[] args) {
        
        List<String> lang = Arrays.asList("Java","C++","JavaScript","Ruby","Phyton");
        System.out.println("Languages which starts with 'J':");  
        filter(lang, str -> str.startsWith("J"));

        List<String> words = Arrays.asList("Java", "Stream", "Method", "References");

        List<String> upperCaseWords = words.stream()
        .map(String :: toUpperCase)
        .collect(Collectors.toList());
        System.out.println("Uppercase Words: " + upperCaseWords);  

    }
}
