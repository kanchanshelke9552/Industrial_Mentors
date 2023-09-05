package JavaBasics;

abstract class AbstractSpecifier {
     abstract void show();
    void display(){

        System.out.println("display");
    }
}
class example extends AbstractSpecifier{
    void show(){

        System.out.println("show");
    }
}
public class AbstractTest{
    public static void main(String[] args){
             AbstractSpecifier a=new example();
             a.show();
             a.display();
    }
}
