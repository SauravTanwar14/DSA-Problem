package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExcercise {

    //filter even number form array
    public static void evenNumber(){

        List<Integer> list = Arrays.asList(2,5,4,7,12,6,11,24);

        List<Integer> result = list.stream()
        .filter(x-> x%2==0)
        .collect(Collectors.toList());

        System.out.print("Even Numbers "+result);
        
    }
    public static void main(String[] args) {
        evenNumber();
    }
}
