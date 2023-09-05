package java_collections;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap map=new HashMap<>();

        map.put(10,"kanchan");
        map.put(11,"Sagar");
        map.put(12,"pradip");
        map.put(13,"Irfan");
        map.put(14,"krutika");
      
        map.put(15,"pratiksha");

        System.out.println(map);
        System.out.println(map.get(10));
        System.out.println(map.containsKey(12));
        System.out.println(map.containsValue("kanchan"));

        System.out.println(map.remove(15));    //remove pair
    }
}
