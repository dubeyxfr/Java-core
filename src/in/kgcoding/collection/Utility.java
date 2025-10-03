package in.kgcoding.collection;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection){
        for (E coll : collection){
            System.out.printf("%s ", coll.toString());
        }
        System.out.println();
    }
}
