package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//map<String,List<String>> map =
public class TestClass {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("name1", Arrays.asList("Saurav","Rahul"));
        map.put("name2", Arrays.asList("Gaurav","Mohit"));

        //take out all the string which contains letter R
                List<String> letterR = map.values()
                        .stream()
                        .flatMap(List::stream)
                        .filter(name->name.toLowerCase().contains("r"))
                        .collect(Collectors.toList());

                System.out.print(letterR);


    }
}
//3 three microservice how change data between