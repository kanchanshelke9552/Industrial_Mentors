package _JAVA_8_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Show{
    public static void show(){
        System.out.println("i am kanchan shelke");
        LocalDate n =LocalDate.now();
        LocalDateTime l=LocalDateTime.now();
        LocalTime t=LocalTime.NOON;
        System.out.println(t.toString());
        System.out.println(n.toString());
        System.out.println(l.toString());
    }
    public static void threaShow(){
     for (int i = 0; i<10; i++){
         System.out.println(i*2);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
    }
}
interface A{
    public void display();
}
public class MethodRef {
    public static void main(String[] args) {
//        A a=()-> System.out.println("hello");
//        a.display();
          A a=Show::show;
          a.display();
          Runnable r=Show::threaShow;
          Thread t=new Thread(r);
          t.start();
        }
    }

