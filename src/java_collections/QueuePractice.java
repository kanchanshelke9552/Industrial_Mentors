package java_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
         Queue q=new LinkedList<>();

         q.offer(10);
         q.offer(20);
         q.add(30);
         q.add(40);
         q.add(50);
         q.add(60);
         q.add(70);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
    }
}

