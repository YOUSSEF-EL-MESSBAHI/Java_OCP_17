package examples;

class Resource implements AutoCloseable {
    public Resource() { System.out.print("R"); }
    public void work() { System.out.print("W"); }
    public void close() { System.out.print("C"); }
}

public class Test {
    public static void main(String[] args) {
        try (Resource r1 = new Resource();
             Resource r2 = new Resource()) {
            r1.work();
            r2.work();
        }
    }
}
