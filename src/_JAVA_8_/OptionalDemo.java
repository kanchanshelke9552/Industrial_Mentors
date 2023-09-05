package _JAVA_8_;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("kanchan");
        list.add(null);

       // System.out.println(list.get(1));

//        Iterator<String> iter=list.iterator();
//
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        String str=null;
        String str2="";
        //System.out.println(str);
        Optional<String> optionl=Optional.ofNullable(str);
        System.out.println(optionl.isPresent());
       // System.out.println(optionl.orElse("kanchan"));


        Optional<String> optionl2=Optional.ofNullable(str2);
        System.out.println(optionl2.isPresent());
      

    }
}
