package java_collections.Tasks_IM;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates  {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);

        List<Integer> newList = new ArrayList<>();
        for (Integer l : list) {
            if (!newList.contains(l)) {
                newList.add(l);
                System.out.println(l);
            }
        }
    }
}
