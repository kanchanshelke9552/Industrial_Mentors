package _JAVA_8_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamAPI{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("kanchan");
        list.add("sagar");
        list.add("pradeep");
        list.add("irfan");
        list.add("pratiksha");

//        for(String s:list){
//            System.out.println(s);
//        }
        list.stream().forEach(t-> System.out.println(t));
        Map<Integer,String> m=new HashMap<>();
        m.put(101,"kanchan");
        m.put(102,"sagar");
        m.put(103,"pradeep");
        m.put(104,"irfan");
        m.forEach((k,v)-> System.out.println(k+" : "+v));
        m.entrySet().stream().forEach(obj-> System.out.println(obj));
    }
}
