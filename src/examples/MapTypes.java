package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapTypes {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "beta");
        list.stream().mapToLong(s -> s.length()).forEach(System.out::print);

//        List<? extends Number> numbers = new ArrayList<Integer>();
//        numbers.add(Integer.valueOf(10));
    }
}
