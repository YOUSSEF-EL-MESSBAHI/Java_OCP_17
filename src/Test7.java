import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List persons = new ArrayList();
        persons.add(new Person("Liam", 25));
        persons.add(new Person("Liam", 27));
        persons.add(new Person("Liam", 25));
        persons.add(new Person("Liam", 25));

        persons.remove(new Person("Liam", 25));

        for(Object person : persons) {
            System.out.println(person);
        }
    }

}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[" + name + ", " + age + "]";
    }

    public boolean equals(Person obj) {
        if(obj instanceof Person) {
            Person person = (Person)obj;
            if(this.name.equals(person.name) && this.age == person.age) {
                return true;
            }
        }
        return false;
    }
}
