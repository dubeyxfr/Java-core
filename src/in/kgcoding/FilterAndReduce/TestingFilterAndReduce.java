package in.kgcoding.FilterAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilterAndReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana","Mango","Cherry","Date");
        System.out.println(fruits.size());
        System.out.println("Printing Fruits Normally!!");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//        System.out.println("Printing Fruits by using Stream!!");
//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        System.out.println("By using Lambda...");
        fruits.stream().forEach(fruit -> System.out.println(fruit));
    }
}
