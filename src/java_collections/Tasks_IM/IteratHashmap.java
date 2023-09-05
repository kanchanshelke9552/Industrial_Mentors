package java_collections.Tasks_IM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "kanchan");
        map.put(11, "Sagar");
        map.put(12, "pradip");
        map.put(13, "Irfan");
        map.put(14, "krutika");
        map.put(15, "pratiksha");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();


        // using iterator cursor

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Id: " + key + ", Name: " + value);
         }

            //using for each

//        for (Map.Entry<Integer, String> e : map.entrySet()) {
//            Integer k = e.getKey();
//            String v = e.getValue();
//            System.out.println(k + " : " + v);
//        }


    }
}
