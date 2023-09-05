package Exception_Handling;
class A{
    public void show()throws ClassNotFoundException{
        Class.forName("Sagar");
    }
}
public class Throws_ex {
    public static void main(String[] args) throws ClassNotFoundException{
        A a =new A();
        a.show();
    }
}

