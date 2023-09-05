package java_collections.MyOwnTasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {
    public static void main(String[] args) {
        Map<Integer, String> map=new ConcurrentHashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");


        Iterator itr=map.keySet().iterator();
        while (itr.hasNext()){
            Integer key=(Integer) itr.next();
            System.out.println(key+" : "+map.get(key));
            System.out.println( map.put(4,"four"));
        }
        //no clone copy concept here that's why print all the elements
    }
}
