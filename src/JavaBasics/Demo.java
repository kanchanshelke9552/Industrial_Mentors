package JavaBasics;

public class Demo {
    public static void main(String[] args){
        Demo3 d=new Demo3();

        d.add();
        d.sum();
    }
}
 class Demo2{
    public void sum(){
        System.out.println("sum method called");
    }

}

      class Demo3 extends Demo2{

      public void add(){
//
          System.out.println("add method called");

      }

  }

