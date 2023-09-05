package _JAVA_8_;
class show{
    static void display(){
        System.out.println("display method");
    }
}
interface IM{
   public void show();
}
public class Meth_Ref {
    public static void main(String[] args) {
        IM im=show::display;
        System.out.println(im);
    }
}
