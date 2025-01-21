package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample1 {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Get an iterator
        Iterator<String> iterator = list.iterator();

        System.out.println("Iterating over the list:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);

            // Adding an element to the list while iterating
            list.add("D");
        }

        // Iterating again to show the added element
        System.out.println("\nAfter modification, list contents:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item); // print nothing because iterator has one snapshot
        }
    }
}
