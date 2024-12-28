package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTestOCP {
    public static void main(String[] args) {
        Test t = new Test();
        t.method1();
    }


}

class Test {
    void method1(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.filter(i -> {
                    System.out.print("Filter: " + i + " ");
                    return i % 2 == 0;
                })
                .forEach(i -> {
                    System.out.print("Action: " + i + " ");
                    if (i == 2) {
                        throw new RuntimeException("Exception at 2");
                    }
                });
    }

    void method2(){
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
