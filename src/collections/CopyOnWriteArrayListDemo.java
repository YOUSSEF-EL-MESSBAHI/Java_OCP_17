package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list
                = new CopyOnWriteArrayList<>();

        // Initial Iterator
        Iterator itr = list.iterator();
        list.add("GfG");
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());

        // iterator after adding an element
        itr = list.iterator();
        System.out.println("List contains:");
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
