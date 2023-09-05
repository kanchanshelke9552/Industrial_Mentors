package _JAVA_8_;
//interface Calculator{
//    void cal(int a,int b);
//}
//public class Lambda_exp {
//    public static void main(String[] args) {
//        Calculator c=(a,b)-> System.out.println("addition : "+(a+b));
//        c.cal(11,22);
//    }
//}
interface Calculator{
    int cal(int a,int b);
}
public class Lambda_exp {
    public static void main(String[] args) {
        Calculator c=(a,b)-> a+b;
        System.out.println(c.cal(11,22));
    }
}