package Java_Interfaces;

interface X {
    void methodX();
    interface Y {
        void methodY();
    }
}
class Z implements X{
    {
        methodX();
        System.out.println(1);
    }
    public void methodX() {
        methodY();
        System.out.println(2);
    }
    public void methodY() {
        System.out.println(3);
    }
}
public class MainInterface {
    public static void main(String[] args) {
        Z z = new Z();
        z.methodX();
        z.methodY();
        X x = z;
        x.methodX();
    }
}
