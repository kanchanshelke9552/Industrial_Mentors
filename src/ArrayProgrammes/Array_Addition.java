package ArrayProgrammes;

import java.util.Scanner;

public class Array_Addition {
    public static void main(String[] args) {
        int Add=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no how long your array");
        int num = sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
             Add=Add+arr[i];
        }
        System.out.println("\nAddition of all elements : "+Add);
    }
}
