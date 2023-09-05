package java_collections;

import java.util.ArrayDeque;

public class ArrayDequepractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq= new ArrayDeque<>();

        adq.offer(10);
        adq.offer(20);
        adq.offerFirst(30);
        adq.offerLast(50);
        adq.offer(60);
        adq.offer(70);
        adq.offerFirst(80);
        adq.offerLast(90);

        System.out.println(adq);

        System.out.println(adq.peekFirst() + "  and  " + adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollLast());




    }
}
