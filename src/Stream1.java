import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    record Car (String type,String make ,String model, String engineCapacity) {}

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Sedan", "Toyota", "Camry", "2.5L"),
                new Car("Sedan", "Toyota", "Camry", "2.5L"),
                new Car("Sedan", "Toyota", "Camry", "2.5L"),
                new Car("SUV", "Honda", "CR-V", "1.5L"),
                new Car("Truck", "Ford", "F-150", "3.5L"),
                new Car("Convertible", "Mazda", "MX-5 Miata", "2.0L"),
                new Car("Hatchback", "Volkswagen", "Golf", "1.4L")
        );
        List<Car> cars2 = cars.stream().filter(c->c.type.equals("Sedan")).toList();
        List<Car> cars3 = cars.stream().filter(c->c.type.equals("Sedan")).collect(Collectors.toList());

        cars.stream().map(c-> c.model).filter(c->c.equals("Toyota")).toList();
        cars.stream().count();

        Map<Boolean, List<Car>> sedan = cars.stream().collect(Collectors.partitioningBy(c -> c.type.equals("Sedan")));
        Map<Boolean, List<Car>> toyota = cars.stream().collect(Collectors.groupingBy(c -> c.make.equals("Toyota")));
        cars.stream().collect(
                Collectors.groupingBy(
                        c -> c.type,
                        Collectors.toMap(
                                c -> c.model, c -> c.engineCapacity
                        )
                )
        );

        Stream<Integer> integerStream = Stream.of(10, 3, 4, 21, 56);
        Stream<Integer> filteredIntegerStream = integerStream.filter(i -> {
            System.out.println("hi");
            return i % 2 == 0;
        });

        System.out.println(filteredIntegerStream.count());

    }
}
