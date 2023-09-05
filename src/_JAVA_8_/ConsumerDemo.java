package _JAVA_8_;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

/* public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("consumer functional interface "+t);
    }
    public static void main(String[] args) {
         ConsumerDemo cd=new ConsumerDemo();
         cd.accept(10);
    }
}*/

// using lambda expression anonymous function


public class ConsumerDemo{
    public static void main(String[] args) {
       /* Consumer<Integer> c = t -> System.out.println("number = " + t);
        c.accept(10);
     //OR
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7);
        list.stream().forEach(c); */
     //OR
        List<Integer> list1 =Arrays.asList(1,2,3,4,5,6,7);
        list1.stream().forEach(t -> System.out.println("number = " + t));
    }
}