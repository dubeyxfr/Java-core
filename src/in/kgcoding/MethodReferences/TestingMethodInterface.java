package in.kgcoding.MethodReferences;

import in.kgcoding.Challange80.Libarary;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);
        number.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);
    }
}
