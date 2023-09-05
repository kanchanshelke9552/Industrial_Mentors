package Exception_Handling;

public class Throw_ex {
    public void div(int x, int y)throws NullPointerException,ArithmeticException{
            int c=x/y;
            System.out.println("division : "+c);
    }
    public static void main(String[] args) {
          Throw_ex tr=new Throw_ex();
          tr.div(20,0);
        System.out.println("hello");
    }
}
