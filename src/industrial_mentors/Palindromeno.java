package industrial_mentors;

import java.util.Scanner;

public class Palindromeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");

        int num= sc.nextInt();

        int orig_num=num;
        int rev=0;

        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(orig_num==rev){
            System.out.println(orig_num +" is palindrome no");
        }
        else{
            System.out.println(orig_num +" is not palindrome no");
        }
    }
}
