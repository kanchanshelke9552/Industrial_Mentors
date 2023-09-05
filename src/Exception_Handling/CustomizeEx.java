package Exception_Handling;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class CustomizeEx {
    public static void main(String[] args) {
       try{
           CustomizeEx.m1(14);
       }catch (Exception e){
           System.out.println(e);
       }
    }
    public static void m1(int age)throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("not eligible for voting...");
        }else {
            System.out.println("eligible for voting...");
        }
    }
}
