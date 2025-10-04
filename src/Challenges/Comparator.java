package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
    List<String> List = Arrays.asList("Bear","Lion", "Ant");
        System.out.println(List);
        sortInDescending(List);
        System.out.println(List);

    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList);
    }
}
