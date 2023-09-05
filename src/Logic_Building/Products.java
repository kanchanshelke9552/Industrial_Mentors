package Logic_Building;

import java.util.Scanner;

public class Products {
    Scanner s=new Scanner(System.in);
    public void Products() {

        char option;
        boolean ch = true;

        Scanner sc = new Scanner(System.in);

        while (ch) {
            System.out.println(" list of Prodects ");
            System.out.println("1) Biscuit");
            System.out.println("2) Gulabjamun");
            System.out.println("3) petha");
            System.out.println("4) jelebi");
            System.out.println("5) Balushahi");
            option = sc.next().charAt(0);
            System.out.println();

            switch (option) {
                case '1':

                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':

                    break;

                default:
                    System.out.println("please select products from list only");
                    break;
            }
        }
    }

//    private void biscuit() {
//    }

    public void Biscuit(){
        System.out.println("how much Quantity you want to order...");
    }
}
class Product2{
    public static void main(String[] args) {
        Products p=new Products();
        p.Products();
    }
}