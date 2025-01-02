package interfaces;

@FunctionalInterface
interface Eat{
    void eat(int amountOfFood);

    default void test() {

    }

    String toString();
    boolean equals(Object object);
    int hashCode();
    private int toStr(){
        return 0;
    }
    static int staticMethod(){
        return 0;
    }
    private static int privateStaticMethod(){
        return 0;
    }
}

public class Lion implements Eat{
    @Override
    public void eat(int amountOfFood) {
        System.out.println(amountOfFood);
    }
}
