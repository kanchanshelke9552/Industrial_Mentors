package sorting_Practice;

public class RecursionPractice {
    int count =0;
    public void f1(){
        if(count==10 ){
            return;
        }
        count++;
        System.out.println(count);
        f1();
    }

    public static void main(String[] args) {
      RecursionPractice r=new RecursionPractice();
      r.f1();
    }
}
