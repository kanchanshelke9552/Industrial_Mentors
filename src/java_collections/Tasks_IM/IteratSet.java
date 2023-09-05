package java_collections.Tasks_IM;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratSet {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(101);
        set.add(102);
        set.add(103);
        set.add(104);
        set.add(105);
        set.add(106);
        set.add(107);
        set.add(108);
        set.add(109);
        set.add(200);

        Iterator itr =set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
