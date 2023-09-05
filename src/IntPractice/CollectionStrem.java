package IntPractice;

import java.util.Arrays;
import java.util.List;

public class CollectionStrem {
    public static void main(String[] args) {
//        Integer arr[]={};
        List<Integer> list= Arrays.asList(1,2647,3,484,54783,6,7487,8,9,29287);
        list.stream().filter(a-> a%2 !=0).forEach(System.out::println);

    }
}
