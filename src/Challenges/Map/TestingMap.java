package Challenges.Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Prashant",80);
        map.put("Dubey",70);
        map.put("Krish",60);
        map.put("Ram",50);
        System.out.println(map.size());
        System.out.println(map.get("Prashant"));
        System.out.println(map.containsKey("Prashant"));
        System.out.println(map.remove("Krish"));
        for (String key : map.keySet()) {
            System.out.printf(" %s : %s ,",key,map.get(key));
        }
    }
}
