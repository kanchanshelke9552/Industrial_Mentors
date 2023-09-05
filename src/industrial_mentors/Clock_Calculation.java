package industrial_mentors;


public class Clock_Calculation {
    public static void main(String[] args) {
        //int a = 0;
        int hour = 0;
        int a_m;
        int a_h;


        for (int i = 0; i < 12; i++) {           //for hour hand
            for (int j = 0; j < 60; j++) {       //for minute hand

                a_m = j * (360 / 60);

                a_h = hour * 30;

                int h_m = a_m - a_h;

                System.out.println(hour+":"+j+" min "+" = "+h_m+" degree angle");
            }
            hour++;
        }

    }
}
