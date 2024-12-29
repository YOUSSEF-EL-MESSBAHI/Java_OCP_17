package exception;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner block");
                throw new ArithmeticException("From inner catch");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in outer block");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
