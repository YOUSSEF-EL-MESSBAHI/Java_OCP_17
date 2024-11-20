import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test5 {
    public static void main(String[] args) {
        BiFunction<String, String, String> func = (str1, str2) -> {
            return (str1 + str2);
        };

        BiPredicate<String, String> predicate = (str1, str2) -> {
            return func.apply(str1, str2).length() > 10;
        };

        String [] arr = {"vention", "historic", "sident", "sentation", "vious"};

        for(String str : arr) {
            if(predicate.test("pre", str)) {
                System.out.println(func.apply("pre", str));
            }
        }

        var sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
    }
}
