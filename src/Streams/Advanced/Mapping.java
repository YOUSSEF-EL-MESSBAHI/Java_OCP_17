package Streams.Advanced;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Mapping {
    public static void main(String[] args) {
        Map<Integer, Optional<Character>> map = Stream.of("lions", "tigers", "bears")
                .collect(groupingBy(String::length,
                        mapping(s -> s.charAt(0),
                                minBy((a, b) -> a - b))));
        System.out.println(map);

        //or
        map = Stream.of("lions", "tigers", "bears")
                .collect(groupingBy(String::length,
                        mapping(s -> s.charAt(0),
                                minBy((a, b) -> a - b))));
        System.out.println(map);

        Map<Integer, List<Character>> map1 = Stream.of("apple", "banana")
                .collect(Collectors.groupingBy(String::length,
                        Collectors.flatMapping(s -> s.chars().mapToObj(c -> (char) c), Collectors.toList())));

        System.out.println(map1);

    }
}
