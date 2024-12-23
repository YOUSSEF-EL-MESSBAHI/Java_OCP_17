package examples;

public class MyRessourceTest {
    public static void main(String[] args) throws Exception {
        try (AutoCloseable autoCloseable= new MyRessource()) {

        }
    }
}
