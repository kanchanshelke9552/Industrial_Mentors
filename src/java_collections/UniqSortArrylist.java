package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniqSortArrylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();
        for (int i=0;i<5;i++){
            int temp=sc.nextInt();

            if (!list.contains(temp)){
                list.add(temp);
            }
            Collections.sort(list);
            System.out.println(list);
        }

    }
}
