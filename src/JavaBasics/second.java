package JavaBasics;

public class second {
    protected int i;

}
class B extends second{
    public static void main(String[] args) {
        second s= new second();
        s.i=20;
        System.out.println(s.i);

    }
}