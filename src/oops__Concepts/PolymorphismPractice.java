package oops__Concepts;

public class PolymorphismPractice {
    public static void main(String[] args) {
        System.out.println("this is programme of pholymorphism");
        p3 p=new p3();
        p.play();
        p.play("cricket");
        p.play(10);

    }
}
class p2{
    public void play(){
        System.out.println("kids playing");

    }
}
class p3 extends p2{
    public void play(String k){
        System.out.println("kids "+ k + " playing");
    }
    public void play(int a){
        System.out.println("kids watching movie" +a);
    }
}
