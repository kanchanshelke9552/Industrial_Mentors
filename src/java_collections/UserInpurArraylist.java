package java_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInpurArraylist {
    public static void main(String[] args) {
        List list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no how long your list");
        int var= sc.nextInt();

        System.out.println("enter elements for make list");
        while (var>=1){

            list.add(sc.nextInt());
            var--;
        }
        System.out.println(list);

    }
}
