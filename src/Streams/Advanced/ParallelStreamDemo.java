package Streams.Advanced;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("spring", "corejava", "spring", "hibernate", "hibernate");
//        words.parallelStream().distinct().forEach(System.out::println); // get just distinct even with parallelStream

        List<Product> products = Arrays.asList(new Product("test1",34,3), new Product("test2",42,3), new Product("test3",13,3));

        Map<String, Double> result = products.stream()
                .filter(p -> p.getPrice() > 20 && p.getQuantity() < 50)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .map(p -> new AbstractMap.SimpleEntry<>(p.getName(), p.getPrice()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, Double> result2 = products.stream()
                .filter(p -> p.getPrice() > 20 && p.getQuantity() < 50)
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toMap(Product::getName, Product::getPrice));

        OptionalDouble averagePrice = products.stream()
                .filter(p -> p.getPrice() > 20 && p.getQuantity() < 50)
                .mapToDouble(Product::getPrice)
                .average();

        System.out.println(averagePrice);
        System.out.println(result);
        System.out.println(result2);
    }
}

class Product {
    private String name;
    private double price;
    private int quantity; // Constructors, getters, and setters
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
