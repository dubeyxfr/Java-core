package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
      List<String> strList = new ArrayList<>();
      strList.add("Prashant");
      strList.add(1," Dubey");
      strList.set(1," Singh");
        if (strList.contains(" Singh")){
            System.out.println(strList.indexOf(" Singh"));
        }
        for (int i = 0;i < strList.size();i++){
            System.out.print(strList.get(i));
        }
        for (String str : strList){
            System.out.print(str);
        }

    }
}


