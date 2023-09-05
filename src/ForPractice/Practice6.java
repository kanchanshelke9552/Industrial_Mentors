package ForPractice;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print no 1");
        int a=sc.nextInt();
        System.out.println("print no 2");
        int b=sc.nextInt();
        System.out.println("print no 3");
        int c=sc.nextInt();

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        if(a>b && a>c){
            System.out.println(a+" is greater no than "+b +" and "+c);
        }
        else if(b>a && b>a){
            System.out.println(b+" is greater no than "+a +" and "+c);
        }
        else{
            System.out.println(c+" is greater no than "+a +" and "+b);
        }
    }
}
