package java_collections.Tasks_IM;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratArrayList {
    public static void main(String[] args) {
            ArrayList e=new ArrayList<>();

            e.add(20);
            e.add("kanchan");
            e.add(90);
            e.add(10);
            e.add("sagar");
            e.add(33);
            e.add(49);
            e.add("pradip");
            e.add(70);

            System.out.println(e);


            //1st by for loop
            for(int i=0;i<e.size();i++){
                System.out.println(e.get(i));
            }

            //2nd by for each
            for(Object element: e){
                System.out.println(element);
            }

            //3rd by iterator
            Iterator<Integer> iter=e.iterator();

            while (iter.hasNext()){
                System.out.println(iter.next());
            }

        }
}
