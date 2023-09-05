package Logic_Building;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee2 {

    public static void main(String[] args) {

        List<Employee> empGender=getEmployeeData();
        Map<String, Long> collect =empGender.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

        List<String> dept=getEmployeeData().stream().map(e->e.getDepartment()).collect(Collectors.toList());
        System.out.println(dept);

        List<Employee> name=getEmployeeData().stream().filter(e->e.getAge()>23).collect(Collectors.toList());
        System.out.println(name);


    }
    public static List<Employee> getEmployeeData(){
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(10,"kanchan",22,"female","study",50000));
        emp.add(new Employee(11,"sagar",21,"male","dance",90000));
        emp.add(new Employee(12,"saloni",23,"female","makeupr",10000));
        emp.add(new Employee(13,"irfan",25,"male","instagram",70000));
        emp.add(new Employee(14,"pradip",24,"male","snapchat",80000));
        emp.add(new Employee(15,"krutika",20,"other","silent",60000));

        return emp;
    }


}
