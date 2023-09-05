package java_collections.Collection_IM_Practice;

import java.util.ArrayList;
import java.util.List;

public class Employeee {
    int empID;
    String empName;
    int age;

    public Employeee(int empID,String empName,int age) {
        this.empID = empID;
        this.empName = empName;
        this.age = age;

    }


    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        List<Employeee> list=new ArrayList<>();
       list.add(new Employeee(101,"pradip",23));
    }
}
