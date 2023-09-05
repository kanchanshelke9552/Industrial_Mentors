package Logic_Building;
import java.util.Scanner;

public class Ingredients {
    static final double FLOUR_B = 0.2,BUTTER_B = 0.3,Water_B=0.2,Oil_B=0.5;
    static final double FLOUR_G = 1.0,BUTTER_G = 0.0,Water_G=0.4,Oil_G=0.1;
    static final double FLOUR_P = 1.2,BUTTER_P = 1.0,Water_P=1.1,Oil_P=1.1;
    static final double FLOUR_J = 1.0,BUTTER_J = 0.5,Water_J=0.1,Oil_J=0.2;
    static final double FLOUR_BA = 1.3,BUTTER_BA = 1.5,Water_BA=1.0,Oil_BA=1.1;
    static final double Price_B=10.0,Price_G=20.0,Price_P=15.0,Price_J=25.0,Price_BA=30.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BiscuitQTY = 0;
        int GulabjamunQTY = 0;
        int PethaQTY=0;
        int JalebiQTY=0;
        int BalushahiQTY=0;

        System.out.println("Welcome to SK store \n please order from here.........:");
        System.out.println("1.  Biscuit");
        System.out.println("2.  Gulabjamun");
        System.out.println("3.  Petha");
        System.out.println("4.  Jalebi");
        System.out.println("5.  Balushahi");
        System.out.println("6. Check ingredient quantities for your order");
        System.out.println("7. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the quantity of Biscuit: ");
                    BiscuitQTY = scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Enter the quantity of Gulabjamun: ");
                    GulabjamunQTY = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter the quantity of Petha: ");
                    PethaQTY = scanner.nextInt();
                    break;
                case 4:
                    System.out.print("Enter the quantity of Jalebi: ");
                    JalebiQTY = scanner.nextInt();
                    break;
                case 5:
                    System.out.print("Enter the quantity of Balushahi: ");
                    BalushahiQTY = scanner.nextInt();
                    break;
                case 6:
                    double totalFlour = (BiscuitQTY * FLOUR_B) + (GulabjamunQTY * FLOUR_G)+ (PethaQTY * FLOUR_P)+ (JalebiQTY * FLOUR_J)+ (BalushahiQTY * FLOUR_BA);
                    double totalButter = (BiscuitQTY * BUTTER_B) + (GulabjamunQTY * BUTTER_G)+ (PethaQTY * BUTTER_P)+ (JalebiQTY * BUTTER_J)+ (BalushahiQTY * BUTTER_BA);
                    double totalWater = (BiscuitQTY * Water_B) + (GulabjamunQTY * Water_G)+ (PethaQTY * Water_P)+ (JalebiQTY * Water_J)+ (BalushahiQTY * Water_BA);
                    double totalOil = (BiscuitQTY * Oil_B) + (GulabjamunQTY * Oil_G)+ (PethaQTY * Oil_P)+ (JalebiQTY * Oil_J)+ (BalushahiQTY * Oil_BA);

                    double TotalPrice = (BiscuitQTY*Price_B) + (GulabjamunQTY * Price_G)+ (PethaQTY * Price_P)+ (JalebiQTY * Price_J)+ (BalushahiQTY * Price_BA);

                    System.out.println("Total Maida needed: " + totalFlour + " cups");
                    System.out.println("Total butter needed: " + totalButter + " cups");
                    System.out.println("Total Water needed: " + totalWater + " Bowls");
                    System.out.println("Total Oil needed: " + totalOil + " Bowls");
                    System.out.println("\n price of your order : "+TotalPrice +" Rs.");
                    break;
                case 7:
                    System.out.println("Thank you for visiting the SK store!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

