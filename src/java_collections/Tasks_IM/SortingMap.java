package java_collections.Tasks_IM;

import java.util.*;

public class SortingMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(48,"diya");
        map.put(38,"dipali");
        map.put(40,"maya");
        map.put(39,"payal");
        map.put(44,"sayli");
        map.put(28,"anjali");


       //Set<Map.Entry<Integer,String>> entryset= map.entrySet();

       List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());



       Collections.sort(list,((o1, o2) -> o1.getValue().compareTo(o2.getValue())));
        System.out.println("Sorted map");

        list.forEach(s-> System.out.println(s.getKey()+" - "+s.getValue()));



    }
}
