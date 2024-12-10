import java.util.stream.IntStream;

public class VarAgsDemo {
    private void modifier(int ...i){
        i[0]=3;
    }

    public static void main(String[] args) {
        int[] i = IntStream.of(1,2).toArray();
        VarAgsDemo va = new VarAgsDemo();
        va.modifier(i);
        System.out.println(i[0]);
    }
}
