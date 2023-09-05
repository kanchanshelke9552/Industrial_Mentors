package _JAVA_8_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//predicate is use to conditoonal check
/*public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        if(i%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        PredicateDemo pd=new PredicateDemo();
        System.out.println(pd.test(4));
    }
}*/
//using lambda expression...........
public class PredicateDemo{
    public static void main(String[] args) {
        Predicate<Integer> pd=i->i%2==0;
        System.out.println(pd.test(10));
                 //OR
        //using stream............
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        list1.stream().filter(i->i%2==0).forEach(t -> System.out.println("even number = " + t));
    }
}