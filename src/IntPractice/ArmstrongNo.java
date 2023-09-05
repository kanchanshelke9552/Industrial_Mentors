package IntPractice;

public class ArmstrongNo {
    public static void main(String[] args) {
        int no=407;
        int tmp=no,cub=0;
       while(no!=0){

           int n=no%10;
           cub=cub+(n*n*n);
           no=no/10;

       }

       if(tmp==cub)
           System.out.println("Armstrong no");
       else
           System.out.println("Not armstrong No");
    }
}
