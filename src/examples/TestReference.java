package examples;

public class TestReference {
    public static void main(String[] args) {
        Dof d=new Dof("d");
        Dof d1 = d;
        d.name="ddd";
        System.out.println(d1.name);// ddd
        d1.name="fff";
        System.out.println(d.name);// fff
        System.out.println(d == d1);
    }
}

