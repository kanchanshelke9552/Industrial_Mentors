package Logic_Building;

import java.util.Scanner;
class ClockHandAngle{
    public static void main(String[] args){
        System.out.println("forword angle");

        System.out.println("What time it is:");
        System.out.println("please enter hour first then min");
        Scanner scan = new Scanner(System.in);

        int hourHandPos, minHandPos;

        hourHandPos = scan.nextInt();
        System.out.print(":");
        minHandPos = scan.nextInt();

        if(hourHandPos>12 || hourHandPos<1){
            System.out.println("Invalid Hour");
        }

        if(minHandPos>59 || minHandPos<0){
            System.out.println("Invalid Min");
        }

        checkAngle(hourHandPos, minHandPos);
    }

    static void checkAngle(int hour, int min){
        if(hour==12){
            hour=0;
        }

        int angleOfMin= 6*min;
        int extra = angleOfMin/(5*12);
        int angleOfHour=30*hour;
        int angleInHand=0;

        if(angleOfHour>angleOfMin){
            angleInHand = angleOfHour- angleOfMin;
            angleInHand += extra;
        }else{
            angleInHand = angleOfMin - angleOfHour;
            angleInHand -= extra;
        }

        System.out.print("Angle between Hour and Min: ");
        System.out.println(angleInHand);
        System.out.println("0=360");
    }
}
