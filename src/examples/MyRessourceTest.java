package examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyRessourceTest {
    public static void main(String[] args) {
//        try (AutoCloseable autoCloseable= new MyRessource()) {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        var x = List.of("hdfhdud");// not accept nulls
        var y = Set.of(2,3); // not accept redandant values
        var z = Arrays.asList("hdfhdud");
        var d = Map.of("1", "GFG",
                "2", "Geek",
                "3", "GeeksForGeeks");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);

        String a="""
            Java 
             SE
            """;
        String s ="-%s-";
        System.out.printf(s,a.charAt(6));


    }
}
