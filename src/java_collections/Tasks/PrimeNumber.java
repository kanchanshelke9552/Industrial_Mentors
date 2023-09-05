package java_collections.Tasks;

public class PrimeNumber {
    public static int Prime(int no){
        for(int i=2; i<no; i++) {
            if(no % i == 0){
               return -1;
            }
        }
        return 1;    //is prime
    }
    public static void main(String[] args) {
        int a=2,b=20;
        for (int i=a; i<=b; i++){
           if (Prime(i)==1){
               System.out.println(i);
           }
        }
    }
}
