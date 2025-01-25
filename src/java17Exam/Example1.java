package java17Exam;

public class Example1 {
    public int x = 100;
    public static void main(String[] args) {
        int x = 1000;
        Example1 e = new Example1();
        e.method(x);
        System.out.println(x);
    }
    public void method(int x){
        x++;
        System.out.println(x);
        System.out.println(this.x);
    }
}
