package stringPractice;

public class FindLengthWithoutFun {
    static String str="hello i am Kanchan";

    public static void getLength(){
        int count=0;
        for (char c1 : str.toCharArray())
            count++;
        System.out.println(count);
    }
    public static int showLength() {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            return i;
        }
    }
    public static void getLengthWitoutFN(){
        int i=0;

        char ch[]=str.toCharArray();

        for(char c : ch)
        {
            i++;
        }
        System.out.println(i);
    }
    
    public static void getLengthOfString(){

    }

    public static void main(String[] args) {
        getLength();
        System.out.println(showLength());
        getLengthWitoutFN();
    }
}
