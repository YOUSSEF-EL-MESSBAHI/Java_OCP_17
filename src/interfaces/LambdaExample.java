package interfaces;

import java.util.function.Function;
import java.util.function.IntFunction;

public class LambdaExample {
    public static void main(String[] args) {
        MyInterface myInterface = (var x, var y) -> x + y;
        int sum = myInterface.add(5, 3);
        System.out.println("Sum: " + sum); // Output: Sum: 8

//        x is effectively final
        Function<Integer,Integer> integerIntFunction = (x) -> {
            x = x + 1; // Compilation error
            return x;
        };
        System.out.println(integerIntFunction.apply(5));
//        (var x, var y) -> x + y;;
        var x = "hi";
        x=null;
        var y =6;
//        y=null;
    }
}

interface MyInterface {
    int add(int x, int y);
}