package stringPractice;

public class demo {
    public static void main(String[] args) {
        String s="kanchan";
        String s1="kanchan";

        System.out.println(s.equals(s1));
        System.out.println(s==s1);

        String ss=new String("hello");
//        String ss1=new String("hello");
//        System.out.println(ss.equals(ss1));
          String ss1=ss.toUpperCase();
          String ss2=ss.toLowerCase();

        System.out.println(ss==ss1);
        System.out.println(ss==ss2);

    }
}
