package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamTestOCP {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Cathy", "Adam", "Eve");
        names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                })
                .map(name -> {
                    System.out.println("Mapping: " + name);
                    if (name.equals("Adam")) throw new RuntimeException("Error with Adam");
                    return name.toUpperCase();
                })
                .forEach(name -> System.out.println("Consuming: " + name));

    }
}
