package Stream_API;

import java.util.*;
import java.util.stream.Collectors;


public class CityFilters {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Amsterdam", "Berlin", "Oslo", "Istanbul", "Zurich", "Edinburgh");

        List<String> filteredCities= cities.stream()
        //starting with vowels
        .map(String::toUpperCase)//converts touppercase
        .collect(Collectors.toList());//collect the result

        System.out.println(filteredCities);


    }

}
