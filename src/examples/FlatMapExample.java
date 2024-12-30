package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<List<Integer>>> deepNested = Arrays.asList(
                Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)),
                Arrays.asList(Arrays.asList(5, 6), Arrays.asList(7, 8))
        );

        List<Integer> collect = deepNested.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
