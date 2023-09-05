package Logic_Building;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bankdetails B=new Bankdetails();
        B.menu();
    }
}

class Bankdetails{
    double balance , amtd;
    double preTrans ,amt;
    public void deposite(double amount){
        if(amount>0) {
            //System.out.println("Enter amount: ");
            balance = amount+balance;
            preTrans = +amount;
            System.out.println("amount deposited");
            System.out.println("balance :" +balance);
        }
    }

    public void withdraw(double amount){
        if(amount>0 && balance>=amount) {
            balance -= amount;
            preTrans = -amount;
            System.out.println("amount withdrawn successful");
            System.out.println("balance :" + balance);
        }
        else if(balance<amount){
                System.out.println("Balance is Insufficient");
        }
    }

    public void preTrans(){
        if(preTrans>0) {
            System.out.println("Deposited amount:" + preTrans);
        } else if (preTrans<0) {
            System.out.println("withdrawn amount:" +preTrans);
        }else{
            System.out.println("No Transaction proceed");
        }
    }

    public void menu(){
        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name ");
        String C_name=sc.nextLine();
        System.out.println("Welcome to our bank "+C_name);
        System.out.println();
        System.out.println("choose Transaction option");
        System.out.println("a) check balance");
        System.out.println("b) withdraw money");
        System.out.println("c) Deposit money");
        System.out.println("d) Previous Transaction");
        System.out.println("e) exit");

        do{
            System.out.println("Choose option");
            option= sc.next().charAt(0);
            System.out.println();

            switch(option){
                case 'a' :
                    System.out.println("Account Balance:" +balance);
                    System.out.println();
                    break;
                case 'b' :
                    System.out.println("Enter the amount :");
                    amt=sc.nextDouble();
                    withdraw(amt);
                    System.out.println();
                    break;
                case 'c':
                    System.out.println("Enter the amount :" );
                    amtd=sc.nextDouble();
                    deposite(amtd);
                    System.out.println();
                    break;
                case 'd':
                    System.out.println("Deposited money :" +preTrans);
                    System.out.println();
                    break;
                case 'e' :
                    break;
                default :
                    System.out.println(" choose other option");
                    break;
            }
        }while(option !='e');
        System.out.println("Thank You ");
    }
}