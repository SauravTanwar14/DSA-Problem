package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapFunction {

    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4),
    Arrays.asList(5, 6)
);

List<Integer> list = nestedList.stream()
.flatMap(List::stream)
.collect(Collectors.toList());
    }
}
