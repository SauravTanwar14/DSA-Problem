package Graph;

import java.util.*;
import java.util.stream.Collectors;

public class FilterName {
    public static void main(String[] args){
        Map<String, List<String>> nameMap = new HashMap<>();

        nameMap.put("name1", Arrays.asList("ram","shayam","vijay","rahul","ajay"));
        nameMap.put("name2",Arrays.asList("sagar","ruchir","ashish","ajay"));

        List<String> filteredName = nameMap.values()
                .stream()
                .flatMap(List::stream)
                .filter(name -> !(name.toLowerCase().startsWith("r") || name.toLowerCase().endsWith("r")))
                .distinct()
                .collect(Collectors.toList());
        System.out.print(filteredName);


    }
}
