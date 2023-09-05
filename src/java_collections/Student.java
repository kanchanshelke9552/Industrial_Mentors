package java_collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " id= " + id +
                ", name= " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Student student = (Student) o;

        if (o == null || getClass() != o.getClass()){
            return false;
        }else {
            return id == student.id && Objects.equals(name, student.name);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
class student1{
    public static void main(String[] args) {
        Set<Student> set=new HashSet();
        Student s1=new Student(101,"kanchan");
        Student s2=new Student(101,"kanchan");
        Student s3=new Student(103,"irfan");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);


//        set.add(new Student(101,"kanchan"));
//        set.add(new Student(101,"kanchan"));
//        set.add(new Student(103,"irfan"));
//        System.out.println(set);
    }
}




//if you deal with any custom object or wrapper classes than set is not following the property with respect duplications
//need to override equals and hashcode methods.
//when you use primitive dt than its is ok.