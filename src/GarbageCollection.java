public class GarbageCollection {
//    System.gc() is not guarante to run
    // freeing memory on heap by deleting unwanted object
    // object had no reference pointing to it + all references gone the object gone out of scope
public static void main(String[] args) {
    System.out.println("Garbage collection started");
    String one , two ;
    one = new String("a");
    two = new String("b");
    one=two;
    String three = one;
    one = null;
    boolean x = three == two;
    System.out.println(x);
    System.out.println("Garbage collection finished"+ x);
    System.out.println("one refere to "+one.intern());
}
}
