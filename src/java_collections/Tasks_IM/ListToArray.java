package java_collections.Tasks_IM;

import java.util.ArrayList;
import java.util.List;
class Studentt {
    int id;
    String name;
    String city;

    public Studentt(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class ListToArray {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int[] arr=new int[list.size()];
        for (int i=0; i<list.size();i++){
            arr[i]=list.get(i);
        }

        for (Integer a:arr) {
            System.out.println(a);
        }



        List<Studentt> stud=new ArrayList<>();

        Studentt s1=new Studentt(1,"kanchan","pune");
        Studentt s2=new Studentt(2,"sagar","mumbai");
        Studentt s3=new Studentt(3,"irfan","dubai");
        Studentt s4=new Studentt(4,"sandip","nashik");

        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        stud.add(s4);

        Studentt studentArray[]=new Studentt[stud.size()];
       for(Studentt studentt :studentArray){
           System.out.println(studentt.getId() + ", " + studentt.getName() + ", " + studentt.getCity());
       }



    }
}
