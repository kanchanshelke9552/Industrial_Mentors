package java_collections.Collection_IM_Practice;

import java.util.HashMap;
import java.util.Map;

class Employee{
    int id;
    String Name;

    public Employee(int id, String name) {
        this.id = id;
        Name = name;
    }
    @Override
    public String toString() {
        return "id=" + id +
                ", Name='" + Name ;
    }
}
public class HashmapP {
    public static void main(String[] args) {
        Map<Employee,String> map=new HashMap<>();
        Employee e1=new Employee(101,"kanchan");
        Employee e2=new Employee(102,"sagar");
        Employee e3=new Employee(103,"krutika");
        Employee e4=new Employee(0,"kanchan");
        map.put(e1,"java");
        map.put(e2,"Ui");
        map.put(e3,"spring");
        map.put(e4,"kanchan");

        System.out.println(map);
    }
}
