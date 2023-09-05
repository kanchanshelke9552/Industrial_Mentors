package IntPractice;

import java.util.HashSet;
import java.util.Set;

public class StringRotation {

    public Set<Character> toCharectorSet(String s)
    {
        Set<Character>set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            set.add(c);
        }
        return set;
    }
     public Boolean cointensAll(String s1,String s2){

        return toCharectorSet(s1).containsAll(toCharectorSet(s2));
     }

    public static void main(String[] args) {
        String s="kanchan";
        String s2="nchankaaahh";

        StringRotation obj=new StringRotation();

        System.out.println( obj.cointensAll(s,s2));

    }
}
