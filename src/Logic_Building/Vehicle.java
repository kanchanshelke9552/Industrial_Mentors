//create an customized exception to handle speed limit of vehicle and throw that exception in a
//program  when speed is gone over 80 km/hr.
package Logic_Building;
import java.util.Scanner;
class SpeedOverLimitException extends Exception{
    public SpeedOverLimitException(String msg) {
        System.out.println(msg);
    }
}

 public  class Vehicle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("speed here : ");
            int speed = sc.nextInt();
            try {
                if (speed > 80) {
                    throw new SpeedOverLimitException("your speed must under 80...");
                } else {
                    System.out.println("Bike running safely");
                }
            } catch (SpeedOverLimitException e) {
                System.out.println("Occur Exception : "+e);
            }

//            System.out.println("+ for rise speed \n- for slow speed");
//            String control = sc.next();
//            if (control == "+") {
//                speed++;
//            } else if (control == "-") {
//                speed--;
//            }
    }
}


