package java_collections.Collection_IM_Practice;
import java.util.ArrayList;
// task : create own arraylist which won't allow duplicates
public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else{
            return super.add(o);
    }
    }
    public static void main(String[] args) {
        User u1=new User(11,"krutika");
        User u2=new User(11,"krutika");
        User u3=new User(12,"kanchan");
        User u4=new User(13,"sagar");
        User u5=new User(12,"kanchan");

        CustomArrayList list=new CustomArrayList();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        System.out.println(list);
    }
}
class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
