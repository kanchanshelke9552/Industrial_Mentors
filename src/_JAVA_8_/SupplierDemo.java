package _JAVA_8_;

import java.util.function.Supplier;

/*public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "hie, my name is kanchan";
    }

    public static void main(String[] args) {
        SupplierDemo sd=new SupplierDemo();
        System.out.println(sd.get());
    }
}*/

// by using lambda expression
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> s=() ->"hie, my name is kanchan";
        System.out.println(s.get());
    }
}