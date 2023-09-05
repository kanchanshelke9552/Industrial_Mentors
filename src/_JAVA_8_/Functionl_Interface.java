package _JAVA_8_;
@FunctionalInterface
public interface Functionl_Interface {
  void m1();
  //void m2();          ( it doesn't allow two abstract method )
    default void m2(){
        System.out.println("default method allow");
    }
    static void m3(){
        System.out.println("static method allow");
    }
}
