package java_collections;

public class ComparablePractice implements Comparable<ComparablePractice>{

    @Override
    public int compareTo(ComparablePractice obj) {
        return this.EmpId-obj.EmpId;
    }

    private String name;
    private String phone;
    private int EmpId;

    public ComparablePractice(String name, String phone, int EmpId){
        this.name=name;
        this.phone=phone;
        this.EmpId=EmpId;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", EmpId=" + EmpId ;
    }

    String getName(){
        return name;
    }

    String getPhone(){
        return phone;
    }

    String phone(){
        return name;
    }


}
