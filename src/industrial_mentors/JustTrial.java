package industrial_mentors;

public class JustTrial {
        int a;
        int b;

        void show(){
            System.out.println(a+" show "+b);
        }
}
class Just2 extends JustTrial{
    void show(String name){
        System.out.println(a+" show "+b+ " Name  "+name);
    }
    public static void main(String[] args){
        Just2 j = new Just2();
        j.a=20;
        j.b=30;
        j.show();
        j.show("Adity");
    }

}