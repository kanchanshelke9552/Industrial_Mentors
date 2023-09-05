package JavaBasics;

public class Trial {
    public static void main(String[] args) {
        String s="hello my name is kanchan shelke ";
        StringBuffer v =new StringBuffer();
        StringBuffer c=new StringBuffer();
        char ch=',';
        int countvowels=0;
        int countcons=0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               // System.out.print(s.charAt(i));
                v.append(s.charAt(i));
                v.append(ch);
                countvowels++;
            }
            else if(s.charAt(i)==' '){
            }
            else {
                c.append(s.charAt(i));
                c.append(ch);
                countcons++;
            }
        }
        System.out.println("total vowels = "+v);
        System.out.println("total consonants = "+c);
        System.out.println("\nTotal vowels in given string = "+countvowels);
        System.out.println("Total consonants in given string = "+countcons);
    }


}
