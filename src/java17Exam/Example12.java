package java17Exam;

class OClass {
    private int var1 = 100;
    public int var2 = 200;
    class IClass {
        int var3 =300;
        public int var4=400;
        int m2() {
            return var2;
        }
    }
    public  int m1(){
        return var1;
    }
}
public class Example12 {
    public static void main(String[] args) {
        OClass.IClass iClass= new OClass().new IClass();
        System.out.println(iClass.var3);
        System.out.println(iClass.var4);
        System.out.println(iClass.m2());
        // iClass can access var3 var4 m2()
    }
}
