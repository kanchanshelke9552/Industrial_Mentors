package java_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
//        TreeSet ts=new TreeSet();
//
//        ts.add("Z");
//        ts.add("F");
//        ts.add("D");
//        ts.add("a");
//        ts.add("s");
//
//        System.out.println(ts);

        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(10);
        tset.add(40);
        tset.add(80);
        tset.add(30);
        tset.add(50);
        tset.add(20);

        //System.out.println(tset);
            Iterator<Integer> it = tset.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

        }

    }

