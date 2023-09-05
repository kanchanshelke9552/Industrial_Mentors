package stringPractice;

public class Examples {
    public static void main(String[] args) {
        String s1="Java";
        String s2=new String("java");
        //String s3=s2;
        //  if(s1==s3){

//        String s3=s2;
//         if(s1.equals(s3)){

//        if (s1.toLowerCase()==s2.toLowerCase()){
          if (s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
