package Exception_Handling;

public class TryCatch__ {
    public static void main(String[] args) {
        try{
            System.out.println("hii");
            System.out.println(100/0);
            System.out.println("hello");
        }catch (Exception e){
            System.out.println("done");
            try {
                System.out.println(20 / 0);
            }catch (ArithmeticException ex){
                System.out.println("arith ex in catch");
            }catch (NullPointerException exx){
                System.out.println("....");
            }
            System.out.println("outside");
            System.out.println(1/0);
        }
    }
}
