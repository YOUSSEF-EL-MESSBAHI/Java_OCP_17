package java17Exam;

public class Example4 {
    public static void main(String[] args) {
        try {
            myMethod();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void myMethod() throws Exception {
        int[] arr = new int[2];
        arr[2] = 10;
    }
}
