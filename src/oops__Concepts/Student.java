package oops__Concepts;

public class Student {
    public static void main(String[] args) {
        Teacher t =new Teacher();
        t.age=30;
        t.name="aakash";
        t.subject="mathmatics";

        Teacher t2 =new Teacher();
        t2.age=40;
        t2.name="sonali";
        t2.subject="Java";

        System.out.println(t.name+ "  age is  "+ t.age);
        System.out.println(t2.name+ "  age is  "+ t2.age);

        t.school();
        t2.college();
        t2.college(7);
    }
}
class Teacher{
    String name;

    String subject;
    int age;

    void school(){
        System.out.println(name +" is teaching in college for "+ subject);
    }

    void college(){
        System.out.println(name +" is teaching in college for "+ subject);
    }

    void college(int exp){
        System.out.println(name +" is teaching in college for "+ subject +" from "+exp+ " years");
    }

}
