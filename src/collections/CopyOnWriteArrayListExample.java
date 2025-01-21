package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements to the list
        list.add("A");
        list.add("B");
        list.add("C");

        // Get an iterator
        Iterator<String> iterator = list.iterator();

        System.out.println("Iterating over the list:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
            iterator.remove(); // This will throw UnsupportedOperationException
            // Attempt to add an element using the iterator

                list.add("D"); // Modifying the list does not affect the iterator
        }

        // ConcurrentModificationException will not occur even with modifications
        list.add("E");
        System.out.println("After modification, list contents: " + list);

        Iterator<String> newIterator = list.iterator();
        System.out.println("Iterating after adding new elements:");
        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }
    }
}

