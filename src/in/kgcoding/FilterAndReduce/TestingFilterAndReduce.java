package in.kgcoding.FilterAndReduce;

import java.util.List;

public class TestingFilterAndReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Mango", "Cherry", "Date");

        System.out.println(fruits.size());

        System.out.println("Printing Fruits Normally!!");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Lambda and Filter
        System.out.println("By using Lambda and Filters");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))  // Apply filter
                .forEach(fruit -> System.out.println(fruit));  // Print filtered results
    }
}
