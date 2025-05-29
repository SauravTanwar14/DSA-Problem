package Stream_API.filter;

import java.util.Arrays;
import java.util.List;

public class FilterString {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Alice","bob","charlie","david","eve",
                "frank","victor","wendy","xavier","yvonne","zoe");

        //filter name with length greater than 3
        name.stream().filter(s -> s.length()>3)
                .forEach(System.out::println);
    }
}
