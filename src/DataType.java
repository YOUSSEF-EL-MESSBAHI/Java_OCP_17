public class DataType {
    public static void main(String[] args) {
//        byte a = 127;
//        a='b';
//        long b = 123L;
//        b='c';
//        byte c = (byte) b;
//        long d = a;
//        float f = 3.14f;
        int s= 0b10;
        System.out.println(s);
        short x=0xff;
        System.out.println(x);
        boolean v=true;
        System.out.println(!v);
        short b=3;
        short c=4 ;
//        b=b+c; //b now is int
        ++b;
        float d= 1.6f;
        int f = (int) d;
        System.out.println(f);

        // custum exception that extend exception are checked exception
        // custum exception that extend runtime exception are unchecked exception
    }
}
