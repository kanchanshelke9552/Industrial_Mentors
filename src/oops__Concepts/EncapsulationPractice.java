package oops__Concepts;

public class EncapsulationPractice {
    public static void main(String[] args) {
        example e=new example();

        e.setJava(92);
        e.setC(80);


    }
}
class example{
    private int java;
   private int c;

    public void setJava(int java) {
        
        this.java = java;

        System.out.println("marks = "+java);
    }

    public void setC(int c){
        this.c=c;
    }
}
