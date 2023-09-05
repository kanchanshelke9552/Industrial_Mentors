package _Singlton_class;

final class SInglton_objClass {
    static SInglton_objClass ref;
    static SInglton_objClass ref2;
    private int empId;
    private String mpName;

    public int getEmpId() {
        return empId;
    }

    public String getMpName() {
        return mpName;
    }

    private SInglton_objClass(int empId, String mpName) {
        this.empId = empId;
        this.mpName = mpName;
    }
    public static SInglton_objClass getreferance(){
        if(ref==null || ref2==null){
            if (ref!=null && ref2==null){
                ref2=new SInglton_objClass(101,"sagar");
                return ref2;
            }else {
                ref=new SInglton_objClass(102,"kanchan");
                return ref;
            }
        }else {
            System.out.println("you can create only two objects");
            return null;
        }
    }
}
public class Singlton_cls{
    public static void main(String[] args) {
       SInglton_objClass obj1=SInglton_objClass.getreferance();
        System.out.println("Employee Id1 ="+obj1.getEmpId());
        System.out.println("Employee Name1 ="+obj1.getMpName());

        SInglton_objClass obj2=SInglton_objClass.getreferance();
        System.out.println("Employee Id2 ="+obj2.getEmpId());
        System.out.println("Employee Name2 ="+obj2.getMpName());
    }
}
