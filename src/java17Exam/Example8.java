package java17Exam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("e1");
        lst.add("e2");
        lst.add("e3");

        Deque<String> deque= new ArrayDeque(lst);
        System.out.println(deque);
        System.out.println(deque.offer("e4")); // offer = add = offerLast
        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
