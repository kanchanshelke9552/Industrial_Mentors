package Java_Interfaces;

interface A1 {
    int methodA();
}
interface B1 {
    int methodB();
}
interface C1 {
    int methodC();
}
class D1 implements A1, B1, C1 {
    int i = 10+20;
    public int methodA() {
        i =i+100;
        return i;
    }
    public int methodB() {
        i = i + i;
        return i;
    }
    public int methodC() {
        i = i+i;
        return i;
    }
}
public class DemoInterface
{
    public static void main(String[] args)
    {
        D1 d = new D1();
        System.out.println(d.i);
        System.out.println(d.methodA());
        System.out.println(d.methodB());
        System.out.println(d.methodC());
    }
}
