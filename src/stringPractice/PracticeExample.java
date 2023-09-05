package stringPractice;

public class PracticeExample {
    public static void main(String[] args) {
        char ch[]={'k','a','n','c','h','a','n'};
         String s=new String(ch);
        System.out.println(s);


        byte b[]={97,67,99,100,75,};
        String s1=new String(b);
        System.out.println(s1+" ");


        String ss="abcdefgh";
        System.out.println(ss.charAt(7));

        String ss1="i am";
        System.out.println(ss1.concat(" java developer"));
        System.out.println(s=ss1+" full stack developer");


    }
}
