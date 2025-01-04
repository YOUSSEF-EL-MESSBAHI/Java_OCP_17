package examples;

public class MyRessourceTest {
    public static void main(String[] args) {
        try (AutoCloseable autoCloseable= new MyRessource()) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
