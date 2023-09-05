package oops__Concepts;

public class inheritancePractice {
    public void m1(){
        System.out.println("m1");
    }
    public void m2(){
        System.out.println("m2");
    }

}
class main1{
    public static void main(String[] args) {
        inheritancePractice ref=new inheritancePractice();
        ref.m1();
    }
}