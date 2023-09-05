package java_collections.Tasks_IM;

import java.util.ArrayList;
import java.util.Collections;

class Student  implements Comparable<Student> {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student stu) {
        if (id==stu.id){
            return 0;
        } else if (id>stu.id) {
            return 1;
        }else {
            return -1;
        }
    }
}
public class ListSorting {
    public static void main(String[] args) {
        ArrayList<Student> l=new ArrayList();
        Student s1=new Student(101,"kanchan");
        Student s2=new Student(100,"sagar");
        Student s3=new Student(203,"irfan");
        Student s4=new Student(200,"krutika");

        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);

        Collections.sort(l);
        System.out.println(l);
    }

}
