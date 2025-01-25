package java17Exam;

public class example2 {
    public static void main(String[] args) {
        int num , e =4;
        num = switch (e) { // should add default
            case 1,2 -> e+5;
            case 3,4 -> e+3;
            case 5,6 -> e+1;
            default -> throw new IllegalStateException("Unexpected value: " + e);
        };
        System.out.println(num);
        System.out.println(Math.round(1/2));
    }
}
