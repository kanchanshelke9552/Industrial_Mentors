package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpSorting {
    private int empId;
    private String empname;
    private int moNum;

    public EmpSorting(int empId, String empname, int moNum) {
        this.empId = empId;
        this.empname = empname;
        this.moNum = moNum;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpname() {
        return empname;
    }

    public int getMoNum() {
        return moNum;
    }

    @Override
    public String toString() {
        return
                "\nempId=" + empId +
                "  empname='" + empname + '\'' +
                "  moNum=" + moNum;
    }
}
class employee2 implements Comparator<EmpSorting> {
    public static void main(String[] args) {
        ArrayList<EmpSorting> emp=new ArrayList<>();
        emp.add(new EmpSorting(105,"sagar",12345677));
        emp.add(new EmpSorting(301,"kanchan",12345677));
        emp.add(new EmpSorting(111,"irfan",12345677));
        emp.add(new EmpSorting(202,"pradip",12345677));
        emp.add(new EmpSorting(001,"krutika",12345677));


       Collections.sort(emp,new employee2());
       //Collections.sort(emp,new emp3());
        System.out.println(emp);

    }

    @Override
    public int compare(EmpSorting o1, EmpSorting o2) {
        return o1.getEmpId()-o2.getEmpId();
    }

}
//class emp3 implements Comparator<EmpSorting>{
//
//    @Override
//    public int compare(EmpSorting o1, EmpSorting o2) {
//        return o1.getEmpname().compareTo(o2.getEmpname());
//    }
//}
