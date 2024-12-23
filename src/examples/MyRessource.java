package examples;

public class MyRessource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing MyRessource");
    }
}
