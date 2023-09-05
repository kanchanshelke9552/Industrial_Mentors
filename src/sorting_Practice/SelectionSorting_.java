package sorting_Practice;

import java.util.Scanner;

public class SelectionSorting_ {
    public static void main(String[] args) {
        int orignal,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 elements :");
        int[] arr=new int[10];

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println(arr);

        for(int i=0;i<arr.length;i++){
            orignal=i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<arr[orignal]){
                    orignal=j;

                }
            }
            temp=arr[i];
            arr[i]=arr[orignal];
            arr[orignal]=temp;
        }
        System.out.print("sorted elements is = ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
