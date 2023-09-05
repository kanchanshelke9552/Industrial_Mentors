package industrial_mentors;
//task:  programme to access private member in same class
public class Test1 {
    void m1(){
        System.out.println("method 1");
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.m1();
    }
}
