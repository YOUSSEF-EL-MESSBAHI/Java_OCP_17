package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        Integer reduceSum = numbers.stream().reduce(2, (a, b) -> a + b);
        System.out.println(reduceSum);
        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxvalueWithMethodReference);


        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxvalue);


        //get employee whose grade A
        //get salary
        double avgSalary = EmployeeDataBase.getAllEmployees().stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("Development"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(avgSalary);

        double sumSalary = EmployeeDataBase.getAllEmployees().stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("Development"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumSalary);

    }
}
