package in.kgcoding.FilterAndReduce;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of(
                "Prashant Dubey",
                "Good in every thing ",
                "Poetry ",
                "par koi ",
                "Sune wala ",
                "nhi h"
        );

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
