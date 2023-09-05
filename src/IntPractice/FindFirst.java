package IntPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,333,23,56,76,40);
       // list.stream().findFirst().ifPresent(System.out::println);

        Set<Integer> set=new HashSet<>();
        list.stream().filter(a->!set.add(a)).forEach(System.out::println);
    }
}
