package Classess;

final class Singltoncls{
    private Singltoncls() {
    }

    static Singltoncls ref;

    public static Singltoncls getRef(){
        if(ref==null){
            ref=new Singltoncls();
            return ref;
        }
        else {
            System.out.println("create only one obj");
            return ref;
        }
    }

}
public class SingltonClass {
    public static void main(String[] args) {
        Singltoncls obj1= Singltoncls.getRef();
        Singltoncls obj2= Singltoncls.getRef();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


    }
}
