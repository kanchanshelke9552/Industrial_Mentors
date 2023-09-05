package JavaBasics;

public class Person {
    private int id;
    private String name;
    private String Add;
    Person(int id,String name,String add){
        this.id=id;
        this.name=name;
        this.Add=add;
    }

    public static void main(String[] args) {
        Person p=new Person(10,"kanchan","sambhajinagar");
        System.out.println("\nid= "+p.id+"\nname= "+p.name+"\nAddres= "+p.Add);
    }
}
