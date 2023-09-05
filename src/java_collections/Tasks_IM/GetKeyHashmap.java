package java_collections.Tasks_IM;

import java.util.*;

public class GetKeyHashmap {
//    public static <K, V> Set<K> getKey(Map<K, V> map, V value) {
//        Set<K> keys = new HashSet<>();
//        for (K key : map.keySet()) {
//            if (value.equals(map.get(key))) {
//                keys.add(key);
//            }
//        }
//        return keys;
//    }


    public static List<Integer> getKey(Map<Integer, String> map, String value){
        List<Integer> list=new ArrayList<>();
        Iterator itr=map.keySet().iterator();
        while(itr.hasNext()){

            int key= (int) itr.next();
            if (map.get(key).equalsIgnoreCase(value)){
               list.add(key);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(21, "gauri");
        map.put(22, "sham");
        map.put(23, "aadrsh");
        map.put(24, "payal");
        map.put(25, "gauri");
        map.put(32, "sham");


        List<Integer> keys = getKey(map, "gauri");

        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()) {
            itr.next();
        }
        System.out.println(keys);
    }
}
