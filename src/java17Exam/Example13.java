package java17Exam;

import java.util.stream.Stream;

public class Example13 {
    public static void main(String[] args) {
        Stream<String> s1= Stream.of("E","G","A");
        Stream<String> s2 = Stream.of("D","C","F");
        var x= Stream.concat(s1,s2).reduce((a,b)->b+a).get();
        System.out.println(x);
    }
}
