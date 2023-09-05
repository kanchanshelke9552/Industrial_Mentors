package _JAVA_8_;
interface Hello{
    void Hello();
}
public class Anonymus_Fn {
    public static void main(String[] args) {
       Hello h =()->{
           System.out.println("hello");
        };
       // or
        Hello he=()-> System.out.println("hello kanchan");
       h.Hello();
       he.Hello();
    }
}
