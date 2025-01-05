package examples;

public class DataDemo {
    public static void main(String[] args) {
        int a = 3, b = 5;
        boolean p = a < 5 & (b > 3 || a-- > 2); // b>3 true so a-- will not be handled because we are in short circuit
        System.out.println(a);
        boolean q = (a > 2) && (++b > 5);
        boolean r = b == 5 || --a < 3;
        System.out.println(p + "-" + q + "-" + r);
        String x = "11_0011";
//        Integer b = Integer.valueOf(a);
        Long c = Long.valueOf(x);
        System.out.println(c);
    }
}
