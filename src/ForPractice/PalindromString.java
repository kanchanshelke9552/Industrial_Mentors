package ForPractice;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word to check palindrome or not : ");
        String s1=sc.next(),s2 = "";
        for (int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if (s1.equals(s2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
