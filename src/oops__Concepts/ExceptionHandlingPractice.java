package oops__Concepts;

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
       try{
           System.out.println(10);
           System.out.println(20);
           System.out.println(30);
           System.out.println(10/0);
           System.out.println(50);
           System.out.println(60);
           System.out.println(70);
           System.out.println(80);
           System.out.println(90);
       }
       catch (ArithmeticException e){
           System.out.println("cannot divide by zero....");
           System.out.println(e.getMessage());

       }
    }
}
