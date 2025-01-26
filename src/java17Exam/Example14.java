package java17Exam;

import java.util.List;

public class Example14 {
    public static void main(String[] args) {
        var list = List.of("Table","Chair");
        var result = list.parallelStream().reduce(
                list.parallelStream().reduce((l,p)->l+p).get(),
                (n,m)->n+m,
                String::concat);
        System.out.println(result);
    }
}
