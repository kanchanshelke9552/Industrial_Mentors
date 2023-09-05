package industrial_mentors;

public class Maindemo {
    public static void main(String[] args) {
        demo2 d= new demo2();
       // d.show();
        // d.demo2();
       // d.demo2();
    }
}
class demo2 extends demo1{
  //int a=10;
   demo2(){

      //super.show();
        System.out.println("show in child");
    }
}
class demo1{
   // int a=20;
     demo1(){
        System.out.println("show in parent");
    }
}
