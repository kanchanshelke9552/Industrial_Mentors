package java_collections.Collection_IM_Practice;
//task 1 :  to print string type arraylist
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Arraylist1 {
    //    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
//    {
//        Arraylist list2 = new Arraylist();
//        for (Integer l : list) {
//
//            if (!list.contains(l)) {
//
//                list.add(l);
//            }
//        }
//        return new ArrayList<>();
//    }
    public static int main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(10);

        if (list == null) {

        } else {

            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);

            System.out.println(((Object[]) field.get(list)).length);
        }
        return 0;


//        System.out.println("before remove duplicates : "+list);
//
//        ArrayList<Integer> l2=new ArrayList<>();
//        for (int i=0;i<list.size();i++){
//            if (!l2.contains(list.get(i))){
//                l2.add(list.get(i));
//            }
//        }
//        System.out.println("after remove duplicates : "+l2);
    }
}

