package industrial_mentors;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");

        int num=sc.nextInt();
        int orignal_no=num;

        int rev=0;

        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;


        }
        if(orignal_no==rev){
            System.out.println(orignal_no+" is palindrome number");
        }
        else{
            System.out.println(orignal_no+" is not palindrome number");
        }


    }
}
