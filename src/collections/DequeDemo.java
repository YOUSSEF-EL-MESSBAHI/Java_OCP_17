package collections;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(1); // offer = offerFirst = push
        deque.offerLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.push(5);

        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst()); // poll == pollfirst
        System.out.println(deque.pollLast());

        System.out.println(deque.pop());

        System.out.println(deque);
    }
}
