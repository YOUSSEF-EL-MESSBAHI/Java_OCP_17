import java.util.stream.IntStream;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(10,1).count());
        StringBuilder sb = new StringBuilder("INHALE ");
        String s = sb.toString() + (sb.append("INHALE "));
        System.out.println(s.strip().length());
        Integer a = 3;
        Integer b = 3;
        System.out.println(a == b);       // true (cached value)
        System.out.println(a.equals(b)); // true (value comparison)
    }
}
