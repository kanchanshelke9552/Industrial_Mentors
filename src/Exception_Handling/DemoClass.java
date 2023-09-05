package Exception_Handling;

public class DemoClass {
    public static void main(String[] args) {

        int num=12345,reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);

        String s1="kanchan";
        String s2="";
        for (int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
}
