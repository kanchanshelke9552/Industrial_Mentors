package Classess;

final class Immutable_Class2 {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Immutable_Class2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Immutable_Class2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Immutable_Class {
    public static void main(String[] args) {
        Immutable_Class2 im=new Immutable_Class2("kanchan",22);
        System.out.println(im);
        //im.name="sagar";
    }
}