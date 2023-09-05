package _JAVA_8_;

import java.util.Optional;

public class Optionaluse {
    public static void main(String[] args) {
        String str=null;
//        System.out.println(str);
//        if(str==null){
//            System.out.println("null value");
//        }else{
//            System.out.println(str.length());
//        }
        Optional<String> optionl=Optional.ofNullable(str);
        System.out.println(optionl.isPresent());
       // System.out.println(optionl.get());
        System.out.println(optionl.orElse("no any value in string"));


    }
}
