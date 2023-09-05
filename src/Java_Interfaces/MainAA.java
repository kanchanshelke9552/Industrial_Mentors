package Java_Interfaces;
interface AA{
    int aa = 20;
    void show(int a);
}
class BB implements AA{
    public void show(int a){
        System.out.println("show "+a);
    }
}
public class MainAA extends BB{
    public static void main(String[] args){
        BB b=new BB();
        b.show(10);
    }
}
