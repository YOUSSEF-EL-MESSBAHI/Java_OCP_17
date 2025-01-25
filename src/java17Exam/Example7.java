package java17Exam;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        Arrays.stream(Design.values()).dropWhile(s->s.equals(Design.CMO));
        switch (Design.valueOf("CMO")){
            case CMO-> System.out.println("Marketing");
            case CEO -> System.out.println("CEO");
            case CFO -> System.out.println("CFO");
            case CTO -> System.out.println("CTO");
            default -> System.out.println("Unknown");
        }
        System.out.println(Design.valueOf("CMO"));
        System.out.println(Design.values()[0].name());
        System.out.println(Design.CEO);
        System.out.println(Design.CEO.c);
    }
}
 enum Design {
    CEO('A'),
     CMO('B'),
     CTO('C'),
     CFO('D');
    char c ;
    Design(char c) {
        this.c = c;
    }
}
