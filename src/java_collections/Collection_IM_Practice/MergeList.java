package java_collections.Collection_IM_Practice;
//task : merge two list
import java.util.ArrayList;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        ArrayList<Integer> l2=new ArrayList<>();

        l2.add(101);
        l2.add(202);
        l2.add(303);

        l2.addAll(l1);
        System.out.println(l2);

//        ArrayList<Integer> merge=new ArrayList<>();
//        merge.addAll(l1);
//        merge.addAll(l2);
//        System.out.println(merge);

    }
}
