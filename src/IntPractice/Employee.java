package IntPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;
    private int salery;

    public Employee(String name, int age, int salery) {
        this.name = name;
        this.age = age;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salery=" + salery +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();

        Employee e1=new Employee("kanchan",23,8000);
        Employee e2=new Employee("sagar",22,9000);
        Employee e3=new Employee("sandip",24,7000);
        Employee e4=new Employee("prajkta",21,5000);
        Employee e5=new Employee("saloni",23,2000);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        List<Employee> newlist= emp.stream().map(e->{
            if (e.getAge()>23){
                e.setSalery(e.getSalery() * 2);
            }
            return e;
        }).collect(Collectors.toList());

        Iterator<Employee> iter=emp.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\n after salery increment \n");

        Iterator<Employee> iter2=newlist.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }


    }
}