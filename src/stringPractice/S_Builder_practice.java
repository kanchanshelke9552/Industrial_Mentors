package stringPractice;

public class S_Builder_practice {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("java");
        String str1=sb.toString();

        String str2=str1;
        System.out.println(str1==str2);

        String str3=new String(str1);
        System.out.println(str1==str3);

        String str4=sb.toString();
        System.out.println(str1==str4);

        String str5="java";
        System.out.println(str1==str5);

    }
}
