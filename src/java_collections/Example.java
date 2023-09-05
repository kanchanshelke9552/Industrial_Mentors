package java_collections;

public class Example {
    public static void main(String[] args) {
        Example e=new Example();
        Example e2=new Example();
        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e.equals(e2));
    }
}
