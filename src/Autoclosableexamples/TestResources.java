package Autoclosableexamples;

class ResourceA implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Closing ResourceA");
        throw new RuntimeException("Exception from ResourceA.close()");
    }

    public void action() {
        throw new RuntimeException("Exception from ResourceA.action()");
    }
}

class ResourceB implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Closing ResourceB");
        throw new RuntimeException("Exception from ResourceB.close()");
    }

    public void action() {
        throw new RuntimeException("Exception from ResourceB.action()");
    }
}

public class TestResources {
    public static void main(String[] args) {
        try (ResourceA a = new ResourceA(); ResourceB b = new ResourceB()) {
            a.action();  // Throws exception first
            b.action();  // This won't execute
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed.getMessage());
            }
        }

//        ResourceA a = null;
//        ResourceB b = null;
//
//        try {
//            a = new ResourceA();
//            b = new ResourceB();
//
//            a.action();
//            b.action();
//
//        } catch (Exception e) {
//            System.out.println("Caught: " + e.getMessage());
//            for (Throwable suppressed : e.getSuppressed()) {
//                System.out.println("Suppressed: " + suppressed.getMessage());
//            }
//        } finally {
//            if (b != null) {
//                try {
//                    b.close();
//                } catch (Exception e) {
//                    System.out.println("Exception while closing ResourceB: " + e.getMessage());
//                }
//            }
//
//            if (a != null) {
//                try {
//                    a.close();
//                } catch (Exception e) {
//                    System.out.println("Exception while closing ResourceA: " + e.getMessage());
//                }
//            }
//        }

    }
}

//Closing ResourceB
//Closing ResourceA
//Caught: Exception from ResourceA.action()
//Suppressed: Exception from ResourceB.close()
//Suppressed: Exception from ResourceA.close()

