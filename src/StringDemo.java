public class StringDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" YOUSSEF");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
