/*
----Account class----
data members
-account number (use static might be better option)
-account holder name
-balance

members Functions
-constructor - initialize all variables
-displayInfo - displays current info status of the ACCOUNT
-deposit - adds money in ACCOUNT
-withdraw - removes money from ACCOUNT
*/
import java.util.Scanner;
import java.io.*;

class Account
{
     private long accNum;
     private String holderName;
     private double balance;
     private int password;

     Scanner sc = new Scanner(System.in);

     Account()
     {
         accNum=0
         holderName=new String();
         balance=0.0;
     }

     void displayInfo()
     {
         System.out.println("ACCOUNT NUMBER : " + accNum );
         System.out.println("ACCOUNT HOLDER : " + holderName );
         System.out.println("BALANCE : " + balance );
     }

     void deposit()
     {
         double depo;
         System.out.println("Enter amount you want to deposit - ");
         depo=sc.nextDouble();
         //adding assertion and exception handling here
         this.balance = this.balance+depo;
         System.out.println("THANK YOU...YOUR AMOUNT HAS BEEN DEPOSITED IN YOUR ACCOUNT\nUPDATED BALANCE : "+this.balance);
     }

     void withdraw()
     {
         double with;
         System.out.println("Enter amount you want to withdraw - ");
         depo=sc.nextDouble();
         //adding assertion and exception handling here
         this.balance = this.balance-with;
         System.out.println("THANK YOU FOR YOUR PATIENCE\nUPDATED BALANCE : "+this.balance);
     }
}

class rootfile
{
    public static void main(String args[])
    {

    }
}
