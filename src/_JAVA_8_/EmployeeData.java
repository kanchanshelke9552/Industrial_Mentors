package _JAVA_8_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class emp{
    private int empId;
    private int empSalery;
    private String empName;
    private String empAdd;
    emp(int empId, int empSalery, String empName, String empAdd){
        this.empId=empId;
        this.empSalery=empSalery;
        this.empName=empName;
        this.empAdd=empAdd;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpSalery(int empSalery) {
        empSalery = empSalery;
    }

    public void setEmpName(String empName) {
        empName = empName;
    }

    public void setEmpAdd(String empAdd) {
        empAdd = empAdd;
    }

    public int getEmpId() {
        return empId;
    }

    public int getEmpSalery() {
        return empSalery;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    @Override
    public String toString() {
        return "empId = " + empId +
                "\n empSalery = " + empSalery +
                "\n empName = " + empName +
                "\n empAdd = " + empAdd + '\n'+'\n';
    }
}
//class comp implements Comparator{
//    @Override
//    public int compare(emp o1, emp o2) {
//        return o1.getEmpName().compareTo(o2.getEmpName());
//    }
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
//}

public class EmployeeData {
    public List<emp> GetData(){
        List<emp> e=new ArrayList<>();
        e.add(new emp(10,2000,"kanchan","sambhajinagar"));
        e.add(new emp(10,2000,"sagar","america"));
        e.add(new emp(10,2000,"irfan","pune"));
        e.add(new emp(10,2000,"pradeep","mumbai"));
        return e;
    }
    public List<emp> SortEmpData(){
        List<emp> e2=new EmployeeData().GetData();
       // Collections.sort(e2, (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
        Collections.sort(e2, Comparator.comparing(emp::getEmpName));
        return e2;
    }
    public static void main(String[] args) {
        System.out.println(" unsorted data : \n");
        EmployeeData e=new EmployeeData();
        System.out.println(e.GetData());
        System.out.println("sorted data : \n");
        System.out.println(new EmployeeData().SortEmpData());

    }
}
