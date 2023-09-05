package stringPractice;

public class TrimMethod {
    public static void main(String[] args) {
        String s="kanchan shelke";
       int len= s.trim().length();
        System.out.println(len);
        System.out.println(s.indexOf(" "));

        String ss="  Kanchan  ";
        System.out.println(ss.length());
        System.out.println(ss.trim().length());

        String s1="  kanchan shelke  ";
        s1.trim();
        System.out.println(s1.indexOf(" "));
    }
}
