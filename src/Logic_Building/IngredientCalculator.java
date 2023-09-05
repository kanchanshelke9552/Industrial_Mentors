package Logic_Building;

import java.util.Scanner;

public class IngredientCalculator {
    // Ingredient class to represent each ingredient
    static class Ingredient {
        String name;
        int quantity;

        public Ingredient(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }

    // Store class to keep track of ingredients
    static class Store {
        Ingredient Biscuit;
        Ingredient Gulabjamun;
        Ingredient petha;
        Ingredient jalebi;

        Ingredient Balushahi;


        public Store() {
            Biscuit= new Ingredient("Flour", 100);
            Gulabjamun = new Ingredient("Sugar", 200);
            Gulabjamun = new Ingredient("Eggs", 50);
            jalebi = new Ingredient("Eggs", 50);
            Balushahi = new Ingredient("Eggs", 50);
        }

        public Ingredient getIngredient(String name) {
            if (name.equals("Biscuit")) {
                return Biscuit;
            } else if (name.equals("Giulabjamun")) {
                return Gulabjamun;
            } else if (name.equals("petha")) {
                return petha;
            } else {
                return null;
            }
        }
    }

    // Order class to represent each order
    static class Order {
        Ingredient Biscuit;
        Ingredient Gulabjamun;
        Ingredient petha;
        Ingredient jalebi;
        Ingredient Balushahi;


        public Order() {
            Biscuit = new Ingredient("Biscuit", 10);
            Gulabjamun = new Ingredient("Gulabjamun", 20);
            petha = new Ingredient("petha", 5);
            jalebi = new Ingredient("jalebi", 5);
            Balushahi = new Ingredient("Balushahi", 5);
        }

        public int getQuantity(String name) {
            if (name.equals("Biscuit")) {
                return Biscuit.quantity;
            } else if (name.equals("Gulabjamun")) {
                return Gulabjamun.quantity;
            } else if (name.equals("petha")) {
                return petha.quantity;
            }  else if (name.equals("jalebi")) {
                return jalebi.quantity;
            } else if (name.equals("Balushahi")) {
                return Balushahi.quantity;
            }else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        // Create store
        Store store = new Store();

        // Create order
        Order order = new Order();

        // Calculate amount of each ingredient needed
        Ingredient orderBiscuit = order.Biscuit;
        Ingredient orderGulabjamiun = order.Gulabjamun;
        Ingredient orderpetha = order.petha;
        Ingredient orderjalebi = order.jalebi;
        Ingredient orderBalushahi = order.Balushahi;

        Ingredient storeBiscuit = store.getIngredient("Biscuit");
        Ingredient storeGulabjamun = store.getIngredient("Gulabjamun");
        Ingredient storepetha = store.getIngredient("petha");
        Ingredient storejalebi = store.getIngredient("jalebi");
        Ingredient storeBalushahi = store.getIngredient("Balushahi");



//        Scanner s=new Scanner(System.in);
//        public void Products() {
//
//            char option;
//            boolean ch = true;
//
//            Scanner sc = new Scanner(System.in);
//
//            while (ch) {
//                System.out.println(" list of Prodects ");
//                System.out.println("1) Biscuit");
//                System.out.println("2) Gulabjamun");
//                System.out.println("3) petha");
//                System.out.println("4) jelebi");
//                System.out.println("5) Balushahi");
//                option = sc.next().charAt(0);
//                System.out.println();
//
//                switch (option) {
//                    case '1':
//
//                        break;
//                    case '2':
//
//                        break;
//                    case '3':
//
//                        break;
//                    case '4':
//
//                        break;
//                    case '5':
//
//                        break;
//
//                    default:
//                        System.out.println("please select products from list only");
//                        break;
//                }
//            }
//        }

        }
    }

