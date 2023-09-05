package java_collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioritQuePractice {
    public static void main(String[] args) {
        Queue<Integer> p =new PriorityQueue<>(Comparator.reverseOrder());

        p.offer(50);
        p.offer(50);
        p.offer(20);
        p.offer(100);
        p.offer(40);
        p.offer(44);

        System.out.println(p);

//        System.out.println(p.peek());
//
//        System.out.println(p.poll());
//
//        System.out.println(p);

//        for(int i=0;i<10;i++){
//            p.add(i);
//           // p.add(1);
//        }
//        System.out.println(p);
//        System.out.println(p.peek());
//        System.out.println(p.poll());
//        System.out.println(p);




    }



}
