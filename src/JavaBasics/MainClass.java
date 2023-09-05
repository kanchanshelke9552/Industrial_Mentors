package JavaBasics;

 class Fifth {
    protected int i=1221;

    void methodOfFifth(){
        System.out.println(i);
    }
}
public class MainClass{
    public static void main(String[] args) {
        Fifth f= new Fifth();
        System.out.println(f.i);
        f.methodOfFifth();

        // output :- 1221
        //           1221
    }
}
