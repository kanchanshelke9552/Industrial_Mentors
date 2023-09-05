package JavaBasics;

public class Trial2 {
    public static void main(String[] args) {
        String str="If ou Belive in yourself Anything is possible";
        int countv=0,countc=0;
        char ch=',';
        String v ="";
        String co ="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                countv++;
                v=v+c+ch;
            } else if (c==' ') {
                
            } else {
                co=co+c+ch;
                countc++;
            }
        }
        System.out.println("vowels ="+v+"\nvowels count ="+countv);
        System.out.println("consonants ="+co+"\nconsonants count ="+countc);
    }
}
