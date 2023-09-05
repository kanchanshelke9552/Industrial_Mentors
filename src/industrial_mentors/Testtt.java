package industrial_mentors;
 class A{
    public void car(){
        System.out.println("....");
    }
}
public class Testtt extends A{
    public void car(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
            Testtt t =new Testtt();
            t.car();
    }
}
