package industrial_mentors;


public class StaticBlock {
    public static void main(String[]args){
        StaticBlock s=new StaticBlock();
        s.display();
        s.show();
 }
   void display(){
       System.out.println("hello ");
   }
    static{
        System.out.println("hello world");
    }
    static {
        System.out.println("kanchan");
    }
    void show(){
        System.out.println("hello");
    }
}

