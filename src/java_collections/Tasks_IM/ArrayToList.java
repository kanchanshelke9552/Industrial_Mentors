package java_collections.Tasks_IM;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        List<Integer> list=new ArrayList<>();
        for(Integer e:arr){
            list.add(e);
        }
        for (Integer e:list){
            System.out.println(e);
        }
    }
}
