import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {

            // creating object of ArrayList<Character>
            List<Character> list = new ArrayList<>();

            // populate the list
            list.add('X');
            list.add('Y');

            // printing the list
            System.out.println("Initial list: " + list);

            // getting unmodifiable list
            // using unmodifiableList() method
            List<Character> immutablelist = Collections.unmodifiableList(list);
            list.add('Z');
            System.out.println(list);
            immutablelist.add('A');
            System.out.println(immutablelist);
            // printing the list
            System.out.println("Unmodifiable list: "
                    + immutablelist);
        }

        catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}