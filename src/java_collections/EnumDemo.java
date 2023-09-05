package java_collections;
import java.util.*;

public class EnumDemo {
        public static void main(String[] args) {
            Vector v = new Vector();

            System.out.println(v.capacity());
            for (int i=0; i <= 10; i++) {
                v.addElement(i);

            }
            System.out.println(v);

            Enumeration e = v.elements();
            while (e.hasMoreElements()) {
                Integer f = (Integer) e.nextElement();

                if (f % 2 == 0) {
                    System.out.println(f);

                }
                System.out.println(v);

            }
        }
    }


