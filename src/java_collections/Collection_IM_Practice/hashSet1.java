package java_collections.Collection_IM_Practice;
// hashset dont allow duplicate values
import java.util.HashSet;
import java.util.Set;

public class hashSet1 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(40);
        set.add(50);
        System.out.println(set);

        //[50, 20, 40, 10] --> insertion order not preserved and duplicate not allowed
    }
}
