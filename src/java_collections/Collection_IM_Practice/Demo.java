package java_collections.Collection_IM_Practice;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
       ArrayList list=new ArrayList();
       list.add(10);
       list.add(20);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);


        if (list == null) {

        } else {

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        System.out.println(((Object[]) field.get(list)).length);
    }
    }
}
