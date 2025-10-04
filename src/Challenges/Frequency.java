package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(1,2,5,6,7,8,1,1);
        System.out.println(Collections.frequency(List,1));
    }
}
