package java_collections.MyOwnTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
    public static void main(String[] args) {
        List<String> list=new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> itr=list.iterator();
        while (itr.hasNext()){
            String s= itr.next();
            System.out.println(s);
            list.add("c");
        }
        //become of clone copy "c" element is not printing
    }
}
