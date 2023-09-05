package ArrayProgrammes;

import java.util.*;

// find Duplicate array element
public class Arraye_Duplicate {
    public static void main(String[] args) {
        int arr[]={5,2,2,1,6,20,88,77,77,5};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println("\n\n");
        // find duplicate word from string

        String s="i am sagar am i learn spring now now now now salunke salunke salunke";
        String str[] =s.split(" ");
      HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<str.length;i++)
        {
            if(map.get(str[i])!=null)
            {
                map.put(str[i],map.get(str[i])+1);
            }
            else{
                map.put(str[i],1);
            }
        }
       Iterator i=map.keySet().iterator();

        //System.out.println(map);
        while(i.hasNext())
        {
            String ss= (String) i.next();
            if(map.get(ss)>1){
                System.out.println(ss+" :"+map.get(ss));
            }
        }
    }
}
