package java_collections;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class Evenno {
    public static void main(String[] args) {




//        System.out.println("                                                                   ");
//        System.out.println("                                                                   ");
//        System.out.println("                                                                   ");
//        System.out.println("                                                                   ");


        ArrayList<Integer> ar=new ArrayList<Integer>();

        ar.add(10);
        ar.add(15);
        ar.add(20);
        ar.add(25);
        ar.add(30);
        ar.add(35);
        ar.add(40);
        ar.add(45);
        ar.add(50);
        ar.add(55);

       // List e=List.of(10,20,30,40);
        System.out.println(ar);
      //  System.out.println(e);

        List<Integer> even=new ArrayList<Integer>();
        List<Integer> odd=new ArrayList<Integer>();

       for(Integer i: ar){
           if(i%2 == 0) {
                even.add(i);
           }else {
               odd.add(i);
           }
       }
        System.out.println("Even numbers = "+even);
        System.out.println("Odd numbers = "+odd);
    }
}
