package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(5);
        numList.add(8);
        numList.add(-13);
        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);
    }
}
