package java17Exam;

public class Example15 {
    public static void main(String[] args) {
        int x= Integer.valueOf("a",16) -9;
        String y="128";
        byte z = Boolean.valueOf(String.valueOf(x)) ? Integer.valueOf(y).byteValue() : (byte) x;
        System.out.println(z); // 1
    }
}
