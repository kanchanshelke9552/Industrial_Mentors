package ArrayProgrammes;

import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Orignal Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\nReverse Array : ");
        for (int i = arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}