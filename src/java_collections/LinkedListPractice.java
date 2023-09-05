package java_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> e=new LinkedList<Integer>();

        e.add(10);
        e.add(20);
        e.add(30);
        e.add(40);

        ArrayList<Integer> list=new ArrayList<>(e);
        for (Integer s:list) {
            System.out.println(s);
        }

        //list.forEach(e->System.out::println(e));
    }
}
