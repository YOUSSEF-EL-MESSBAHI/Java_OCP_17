import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jack", 10000),
                new Employee("Lucy", 12000));
        employees.stream()
                .peek(e -> e.setSalary(e.getSalary() + 1000))
                .forEach(System.out::println);
    }
    }

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "{" + name + "," + salary + "}";
    }
}
