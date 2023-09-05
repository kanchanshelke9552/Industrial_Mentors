package oops__Concepts;

public abstract class AbstractionPractice {
   public abstract void display();
}

class show extends AbstractionPractice{
    public static void main(String[] args) {
//        AbstractionPractice a=new AbstractionPractice() {
//            @Override
//            public void display() {
//                System.out.println("d");
//            }
            show s=new show();
            s.display();
        }



    @Override
    public void display() {
        System.out.println("display method called");
    }
}