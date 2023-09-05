package java_collections;

import java.util.ArrayList;

public class Reverce {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println("reverse :");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list);
        }

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

    }
}
