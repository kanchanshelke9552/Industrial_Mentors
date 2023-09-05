package _JAVA_8_;

public record Record_Demo(int id,String name,int age,int salery) {
    public static void main(String[] args) {
        Record_Demo rd=new Record_Demo(101,"kanchan",23,20000);
        Record_Demo rd2=new Record_Demo(102,"sagar",22,90000);
        Record_Demo rd3=new Record_Demo(103,"irfan",25,50000);
        System.out.println(rd);
        System.out.println(rd2);
        System.out.println(rd3);
    }
}
