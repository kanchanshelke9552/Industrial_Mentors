package java_collections.Tasks;

import java.util.HashSet;
import java.util.Set;

public class IntersectionPoint {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Set<Integer> set2=new HashSet<>();
        set.add(101);
        set.add(30);
        set.add(201);
        set.add(44);

        for (Integer i:set) {
            for (Integer j:set2) {
                if (i==j){
                    System.out.println(j);
                }
            }
        }
    }
}
