package industrial_mentors;
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(100);
        Scanner sc=new Scanner(System.in);

        boolean b=true;
        while (b) {
            System.out.println("Enter Number = ");
            int no=sc.nextInt();
            if (no == number) {
                System.out.println("yes... you are Right");
                b=false;
            } else if (no < number) {
                System.out.println("Less Number");
            } else if (no > number) {
                System.out.println("Grater Number");
            } else {
                System.out.println("enter valid number");
            }
        }
    }
}
