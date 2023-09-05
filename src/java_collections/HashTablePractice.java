package java_collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.security.KeyStore;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht=new Hashtable<Integer, String>();

        ht.put(101, "mango");
        ht.put(202, "pineapple");
        ht.put(303,"apple");
        ht.put(404,"banana");
        ht.put(505,"guava");
       // ht.put(null,"strawberry");           ( NullPointerException )
        // ht.put(707,null);

        System.out.println(ht);

        System.out.println(ht.isEmpty());

        // all methods like hash map

        System.out.println(ht.keySet());
        System.out.println(ht.values());

        for(int k:ht.keySet()){                      //for showing the individual key and values.
            System.out.println(k +"   "+ht.get(k));
        }
        System.out.println("                                          ");
        System.out.println("                                          ");
        //Entry specific method
        for(Map.Entry entry:ht.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("                                          ");
        System.out.println("                                          ");


        Set s=ht.entrySet();

        Iterator it=s.iterator();

        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

    }
}
