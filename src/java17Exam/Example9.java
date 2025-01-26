package java17Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("e1");
        lst.add("e3");
        lst.add("e2");

        int x1= Collections.binarySearch(lst,"e3");
        System.out.println(x1);
        Collections.sort(lst);
        int x2= Collections.binarySearch(lst,"e3");
        System.out.println(x2);
        Collections.reverse(lst);
        System.out.println(lst);
        int x3= Collections.binarySearch(lst,"e3");
        System.out.println(x3);

    }
}
