package JavaBasics;

 class ExampleStatic1 {
  public int add(int a,int b){
      System.out.println("base class");
      return a+b;
  }
     public static void display() {
         System.out.println("In the  base class.");
     }

}
class ExampleStatic2 extends ExampleStatic1 {
    public int add(int a, int b) {
        System.out.println("child class");
        return a + b;
    }
    public static void display() {
        System.out.println("In the Base class.");
    }
}
public class Example{
    public static void main(String[] args) {
        ExampleStatic1 e=new ExampleStatic2();
        System.out.println( e.add(10,20));
        e.display();

    }
}
