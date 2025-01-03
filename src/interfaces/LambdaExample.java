package interfaces;

import java.time.ZonedDateTime;

public class LambdaExample {
    public static void main(String[] args) {
        MyInterface myInterface = (var x, var y) -> x + y;
        int sum = myInterface.add(5, 3);
        System.out.println("Sum: " + sum); // Output: Sum: 8
    }
}

interface MyInterface {
    int add(int x, int y);
}