package stringPractice;

public class STR_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        //method chaining
        sb.append("hello").append(" kanchan").append(" how are you").length();
        System.out.println(sb);

        StringBuilder build=new StringBuilder(5);
        String str="";
        if (build.equals(str)){
            System.out.println("first");
        } else if (build.toString().equals(str.toString())) {
            System.out.println("second ");
        }
        else{
            System.out.println("no match");
        }
    }

}
