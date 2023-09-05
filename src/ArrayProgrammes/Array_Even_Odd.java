package ArrayProgrammes;

import java.util.Scanner;

public class Array_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no how long your array");
        int num = sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("Even numbers  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("\nOdd Numbers = ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

