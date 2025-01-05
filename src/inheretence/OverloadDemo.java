package inheretence;

public class OverloadDemo {
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        // Call with integer literals
        obj.method(10, 10); // Exact match with (int, int)

        // Call with decimal literals
        obj.method(12.33, 14.32); // Exact match with (double, double)

        // Call with explicit float literals
        obj.method(12.33, 14.32f); // Exact match with (float, float)

        // Call with long literals
        obj.method(10L, 10); // Exact match with (long, long)
    }
}

class OverloadExample {
    // Method with two int parameters
    void method(int a, int b) {
        System.out.println("int method");
    }

    // Method with two float parameters
    void method(float a, float b) {
        System.out.println("float method");
    }

    // Method with two double parameters
    void method(double a, double b) {
        System.out.println("double method");
    }

    // Method with two long parameters
    void method(long a, long b) {
        System.out.println("long method");
    }
}

