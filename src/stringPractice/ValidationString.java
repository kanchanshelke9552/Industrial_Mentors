package stringPractice;

import java.util.Scanner;

public class ValidationString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name : " );
        String name= sc.nextLine().trim().toLowerCase();

//        if(name==null && name.isEmpty()){
//            System.out.println("pleas enter something");
//        }
//        else if (name.equals(name.toUpperCase())){
//            System.out.println("please enter your name correct");
//        }
//        else if (name.equals(name.toLowerCase())){
//            System.out.println("please enter your name correct");
//        }
//        else {
//            System.out.println("hello , your name is "+name);
//        }
        if(name.equals("kanchan")){
            System.out.println("hello kanchan");
        }
       else if(name=="krutika"){
            System.out.println("hello krutika");
        }
       else{
            System.out.println("please enter valid name");
        }
    }

}
