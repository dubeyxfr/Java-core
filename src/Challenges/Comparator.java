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
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return -1;
                }else {
                    return 1;
                }
            }
        });
    }
}
