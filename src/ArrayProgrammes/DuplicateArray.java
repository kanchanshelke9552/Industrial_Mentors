package ArrayProgrammes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[]={2,5,2,4,9,6,6};
        Set<Integer> s=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(s.contains(arr[i])){
                System.out.println(arr[i]);
            }
            else {
                s.add(arr[i]);
            }
        }
    }
}
