package ArrayProgrammes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter some numbers to create list : ");

        List<Integer> list=new ArrayList<Integer>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
