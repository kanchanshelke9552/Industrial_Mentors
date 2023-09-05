package java_collections;

public class RegExpractice {
    public static void main(String[] args) {
        String names="Ajay.2345Samarth.45556Mansi.Paayal";

//        String[] name=names.split("\\.");
//
//        for(String s : name){
//            System.out.println(s);
        System.out.println(names.replaceAll("[^a-z+]",""));
        System.out.println(names.replaceAll("[^0-9+]",""));
        System.out.println(names.replaceAll("\\D",""));

        }
    }

