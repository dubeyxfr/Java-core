package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
      List strList = new ArrayList();
      strList.add("Prashant");
      strList.add(1," Dubey");
        for (int i = 0;i < strList.size();i++){
            System.out.print(strList.get(i));
        }

    }
}


