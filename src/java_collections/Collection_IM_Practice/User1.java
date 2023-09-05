package java_collections.Collection_IM_Practice;

import java.util.ArrayList;

public class User1 {
    int id;
    String name;
    String skills;
    Address Address;

    public User1(int id, String name, String skills, Address address) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        Address = address;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills='" + skills + '\'' +
                ", Address=" + Address +
                '}';
    }
}
class Address{
    String city;
    String state;
    int pinCode;

    public Address(String city, String state, int pinCode) {
        this.city = city;
        this.state=state;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<User1> u1 = new ArrayList<>();

        Address add1 = new Address("pune", "maharashtra", 123456);
        Address add2 = new Address("pune", "maharashtra", 9000999);
        Address add3 = new Address("mumbai", "maharashtra", 889923);
        Address add4 = new Address("pune", "maharashtra", 232333);
        Address add5 = new Address("Aurangabad", "maharashtra", 123456);
        Address add6 = new Address("pune", "maharashtra", 9000999);
        Address add7 = new Address("mumbai", "maharashtra", 889923);
        Address add8 = new Address("pune", "maharashtra", 232333);
        Address add9 = new Address("Aurangabad", "maharashtra", 123456);
        Address add10 = new Address("pune", "maharashtra", 9000999);

        u1.add(new User1(101, "kanchan", "java", add1));
        u1.add(new User1(101, "pradip", "spring", add2));
        u1.add(new User1(101, "irfan", "advJava", add3));
        u1.add(new User1(101, "sagar", "java", add4));
        u1.add(new User1(101, "pratiksha", "java", add5));
        u1.add(new User1(101, "mohan", "spring", add6));
        u1.add(new User1(101, "gautami", "advJava", add7));
        u1.add(new User1(101, "krutika", "java", add8));
        u1.add(new User1(101, "saloni", "java", add9));
        u1.add(new User1(101, "shubhangi", "spring", add10));


        for (User1 user : u1) {
            if (user.skills.equalsIgnoreCase("Java") && user.Address.city.equalsIgnoreCase("Pune")) {
                System.out.println(user);
            }
        }
    }
}
