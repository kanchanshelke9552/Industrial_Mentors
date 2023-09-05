package ArrayProgrammes;
import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        int pos_C = 0;
        int neg_C = 0;
        int ze_C = 0;

        Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a 'ex' to quit :");
        while (true) {
            String sc = scanner.nextLine();
           // Scanner s=new Scanner(System.in);
            if (sc.equals("ex")) {
                break;
            }
            int number = Integer.parseInt(sc);

            if (number > 0) {
                pos_C++;
            } else if (number < 0) {
                neg_C++;
            } else {
                ze_C++;
            }
        }
        System.out.println("Positive Numbers : " + pos_C);
        System.out.println("Negative Numbers : " + neg_C);
        System.out.println("Zero's : " + ze_C);
    }
}
