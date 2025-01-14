package finalKeywork;

public class Example1 {

    public static void main(String[] args) {
        final int x;


        x = 10;
    }

    void m(final int x) {
        // here
        // x = 10;
        // value 10
        class B {
            void speed() {
                System.out.println("speed");
            }
        }
        B b = new B();
        b.speed();
    }
}
