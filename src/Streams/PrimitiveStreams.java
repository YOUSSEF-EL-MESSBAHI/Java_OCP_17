package Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
//        integerStream.min(Integer::compare);
//        long sum = integerStream.reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//        long count = integerStream.count();
//        System.out.println(sum/count);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
//        long sum2 = intStream.reduce(0, (a, b) -> a + b);
//        long count2 = intStream.count();
        intStream.average().ifPresent(System.out::println);
        Stream<Integer> integerStream = IntStream.of(1, 2).boxed();
        Stream<Long> boxed = LongStream.of(1L, 2L).boxed();
        boxed.forEach(System.out::println);
        OptionalInt min = intStream.min();
        OptionalInt max = intStream.max();
        int sum = intStream.sum();
        OptionalDouble average = intStream.average();

    }
}
