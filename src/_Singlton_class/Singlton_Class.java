package _Singlton_class;
class NullObjectException extends Exception{
    NullObjectException(String s){
        System.out.println(s);
    }
}
 final class Immutableclass2 {
    private static Immutableclass2 obj;

    private Immutableclass2() {
        System.out.println("helllo");
    }
    public static Immutableclass2 getobj() {
        if (obj == null) {
            obj = new Immutableclass2();
            return obj;
        } else {
            System.out.println("only one obj");
            return null;
        }
    }
    public void m1(){
        System.out.println("hello");
    }
}
public class Singlton_Class {
    public static void main(String[] args)  throws  NullObjectException{
        Immutableclass2 im=Immutableclass2.getobj();
        im.m1();
        Immutableclass2 im2=Immutableclass2.getobj(); throw  new NullObjectException("only one object create");
    }
}
