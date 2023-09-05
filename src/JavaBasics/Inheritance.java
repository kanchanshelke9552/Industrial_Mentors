package JavaBasics;

 class I1 {
    public void add(int a, int b){
        System.out.println("Addition is = "+ (a+b));
    }
}

class I2 extends I1{
    public void sub(int a, int b){
        System.out.println("Subtraction is = "+ (a-b));
    }
}

class I3 extends I2{
    public void mult(int a, int b){
        System.out.println("Multiplication is = "+ (a*b));
    }

}

class I4 extends I3{
    public void div(int a, int b){
        System.out.println("division is = "+ (a/b));
    }


}
public class Inheritance extends I4{
  public static void main(String[] args){

        Inheritance i=new Inheritance();
         i.add(4,5);
         i.sub(9,3);
         i.mult(7,9);
         i.div(16,8);



  }

}
