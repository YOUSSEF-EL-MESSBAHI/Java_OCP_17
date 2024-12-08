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


        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numberss.stream()
                .reduce(0, (partialSum, num) -> partialSum + num, Integer::sum);
        System.out.println(sum);

        List<String> wordss = Arrays.asList("Java", "is", "fun","hhhhh");
        String sentence = wordss.stream()
                .reduce("", (partial, word) -> partial + word + " ", String::concat);
        System.out.println(sentence.trim());

        String result = wordss.stream().parallel()
                .reduce(
                        "",
                        (partial, word) -> {
                            System.out.println("Accumulator: partial = \"" + partial + "\", word = \"" + word + "\"");
                            return partial + word + " ";
                        },
                        (partial1, partial2) -> {
                            System.out.println("Combiner: partial1 = \"" + partial1 + "\", partial2 = \"" + partial2.toUpperCase() + "\"");
                            return partial1 + partial2.toUpperCase();
                        }
                );

        System.out.println("Final Result: " + result);

//        System.out.println(result.trim());


        List<String> words1 = Arrays.asList("hello", "world","hi","youssef");

        String result1 = words1.parallelStream()
                .reduce(
                        "",
                        (partial, word) -> {
                            System.out.println(partial + " acumulator " + word);
                            return partial + word;
                        }, // Accumulator
                        (partial1, partial2) -> {
                            System.out.println("combiner " + partial1 + " and " + partial2);
                            return partial1.toUpperCase() + partial2.toLowerCase();
                        } // Combiner
                );

        System.out.println(result1);


        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result2 = numbers.parallelStream()
                .reduce(
                        0, // Identity
                        (partialSum, num) -> { // Accumulator
                            System.out.println("Accumulator: partialSum = " + partialSum + ", num = " + num);
                            return partialSum + num;
                        },
                        (sum1, sum2) -> { // Combiner
                            System.out.println("Combiner: sum1 = " + sum1 + ", sum2 = " + sum2);
                            return sum1 + sum2;
                        }
                );

        System.out.println("Final Result: " + result2);


    }
}
