package in.kgcoding.Optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,2,4,5,6,7,8,9,10);
        Optional<Integer> numSum2 = number.stream()
                .reduce((a,b) -> a + b);
        if (numSum2.isPresent()){
            System.out.println(numSum2.get());
        }else {
            System.out.println("List is Empty");
        }
    }
}
