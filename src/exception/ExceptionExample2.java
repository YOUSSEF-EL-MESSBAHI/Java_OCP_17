package exception;

public class ExceptionExample2 {
    static class Walk implements AutoCloseable {
        public void close() {
            throw new RuntimeException("hello");
        }
    }

    public static void main(String[] args) {
        try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {
            throw new RuntimeException("hola");
        } catch (Exception e) {
            System.out.println(e.getMessage()
                    + " " + e.getSuppressed().length);
        }
    }
}
