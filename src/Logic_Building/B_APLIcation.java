package Logic_Building;

import java.util.Scanner;

public class B_APLIcation {
    double balance1,balance2,preTrans,amtd,amount,amt;
    String C_name;

    String user2;
    private String userName;
    String Name1,Name2;
    private int accountNumber;
    static int AccountNumber=10001;
    String mailId;
    double TransferMoney;

    Scanner s=new Scanner(System.in);


    public double getAccountNumber() {
        return accountNumber;
    }

    public String getUserName() {
        return userName;
    }
    //    static class CrateAccount{
//        String userName;
//        double accountNumber;
//        public CrateAccount(String userName,double accountNumber){
//            this.accountNumber=accountNumber;
//            this.userName=userName;
//        }
    public B_APLIcation(String c_name){
        this.C_name=c_name;
    }

    public void menu() {

        char option;
        boolean b=true;

        Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to our bank " + C_name);
            //System.out.println("");
        while (b) {
            System.out.println("....choose Transaction option....");
            System.out.println("a) Search list of user accounts");
            System.out.println("b) Deposite Money");
            System.out.println("c) withdraw money");
            System.out.println("d) Check Balance");
            System.out.println("e) Previous Transaction");
            System.out.println("f) Transfer Money");
            System.out.println("g) exit");

            option = sc.next().charAt(0);
            System.out.println();

            switch (option) {
                case 'a':
                   UserAccount(Name1,Name2,mailId,AccountNumber);

                    break;
                case 'b':
                    System.out.println("Enter the amount :");
                    amtd = sc.nextDouble();
                    deposite(amtd);
                    System.out.println();
                    break;
                case 'c':
                    System.out.println("Enter the amount :");
                    amt = sc.nextDouble();
                    withdraw(amt);
                    System.out.println();

                    break;
                case 'd':
                    System.out.println("Account Balance:" + balance1);
                    System.out.println();
                    break;
                case 'e':
                    System.out.println("Previous Transaction :" + preTrans);
                    System.out.println();
                    break;
                case 'f':
                        TransferMoney(amount);
 //                         if(option=='e'){
//                         char opt;
//                         Scanner s=new Scanner(System.in);
//                         opt=s.next().charAt(0);
//
//                         System.out.println("");
//                     }
                    break;
                case 'g':
                    b=false;
                    break;
                default:
                    System.out.println(" choose other option");
                    break;
            }
        }
    }
    public void UserAccount(String Name1,String Name2,String mailId,int AccountNumber){
        Scanner ss=new Scanner(System.in);
//        System.out.println("please say yes if you want to create account");
//        String r=ss.next().toLowerCase();

//        if(r=="yes"){
            System.out.println("enter First user Name : ");
            Name1=ss.next();

            System.out.println("enter First user e-mail id : ");
            mailId=ss.next();

            System.out.println("enter second user Name : ");
            Name2=ss.next();

            System.out.println("enter second user mail id");
            mailId=ss.next();

            if(Name1!="null" && mailId!="null" && Name2!="null" ) {
                System.out.println("First user :"+Name1+"\n Email ID:"+mailId+"\n Account Number : "+AccountNumber++ +"\n");
                System.out.println("Second user name :" + Name2 + "\n Email ID : " + mailId+" \n Account Number : "+AccountNumber++ +"\n\n");
            }
//        }
//        else if(r=="no"){
//            System.out.println("thank you for visiting in our bank");
//            System.out.println("keep visiting.......!");
//        }
    }
    public void deposite(double amount) {
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        if (userName == Name1) {
            if (amount > 0) {
                //System.out.println("Enter amount: ");
                balance1 = amount + balance2;
                preTrans = +amount;
                System.out.println("amount deposited succesfully");
                System.out.println("balance :" + balance1);
            }
        } else {
            if (amount > 0) {
                //System.out.println("Enter amount: ");
                balance2 = amount + balance1;
                preTrans = +amount;
                System.out.println("amount deposited succesfully on " + userName + "s account ");
                System.out.println("balance :" + balance2);
            }
        }
    }

    public void withdraw(double amount){
        if(amount>0 && balance1>=amount) {
            balance1 = balance1-amount;
            preTrans = -amount;
            System.out.println("amount withdrawn successful");
            System.out.println("balance :" + balance1);
        }
        else if(balance1<amount){
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

    public void TransferMoney(double amount){
        System.out.println("enter a name and account number of on which you want to transfer money");
        System.out.println("User Name =");
        userName=s.next();
        System.out.println("Account Number =");
        accountNumber=s.nextInt();
         if(userName==Name1 || userName==Name2 && accountNumber!=0) {
             System.out.println("Transfer Money =");
             TransferMoney=s.nextDouble();
         }else if(accountNumber==0){
             System.out.println("please enter user name and account number correct");
         }
       if(TransferMoney>0) {
           balance2 = balance1 + TransferMoney;
           preTrans = +TransferMoney;
           System.out.println("transfer " + TransferMoney + " Rs. successful on " + userName + "'s account");
           System.out.println();
       }else if(TransferMoney<0){
           System.out.println("insufficient balance");
       }
    }
}
class B_Application2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name ");
        String C_name=sc.nextLine();
        B_APLIcation B=new B_APLIcation(C_name);
        B.menu();
    }
}
