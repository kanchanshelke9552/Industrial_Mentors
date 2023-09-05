package java_collections;

import java.util.ArrayList;
import java.util.Collections;


public class ComparablePractice2{
    public static void main(String[] args){
        ArrayList<ComparablePractice> emp=new ArrayList<>();

            emp.add(new  ComparablePractice("kanchan", "123456789", 234));
            emp.add(new  ComparablePractice("sagrya", "123456455465", 23));
            emp.add(new  ComparablePractice("pradipya", "1234563489", 50));

        System.out.println(emp);
        Collections.sort(emp);
        System.out.println(emp);
  }

}