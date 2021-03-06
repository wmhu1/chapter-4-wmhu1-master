//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;
import java.util.Scanner;

public class Account
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%

   private int acctNumber;
   private double balance;
   private String name;

   /**
   * Sets up the account by defining its owner, account number,
   *  and initial balance.
   */
   public Account (String owner, int account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
   }
   public Account(String owner, int account)
   {
       name = owner;
       acctNumber = account;
       balance = 0;
    }

   /**
   *  Validates the transaction, then deposits the specified amount
   *  into the account. Returns the new balance.
   */
   public double deposit (double amount)
   {
      if (amount < 0)  // deposit value is negative
      {
         System.out.println ();
         System.out.println ("Error: Deposit amount is invalid.");
         System.out.println (acctNumber + "  " + fmt.format(amount));
      }
      else
         balance = balance + amount;
      return balance;
   }

   /**
   *  Validates the transaction, then withdraws the specified amount
   *  from the account. Returns the new balance.
   */
   public double withdraw (double amount, double fee)
   {
      amount += fee;

      if (amount < 0)  // withdraw value is negative
      {
         System.out.println ();
         System.out.println ("Error: Withdraw amount is invalid.");
         System.out.println ("Account: " + acctNumber);
         System.out.println ("Requested: " + fmt.format(amount));
      }
      else
         if (amount > balance)  // withdraw value exceeds balance
         {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
         }
         else
            balance = balance - amount;

      return balance;
   }

   /**
   *  Asks the user for amount to transfer
   *  from one account to another, validates transaction, withdrawing
   *  specified amount from one account, depositing in the other.
   */
   public void transfer (Account other)
   {
        System.out.print("Enter amount to transfer");
        Scanner keyboard = new Scanner(System.in);
        double transfer = keyboard.nextDouble();
        if (transfer < 0)
      {
         System.out.println ();
         System.out.println ("Error: Transfer amount is invalid.");
         System.out.println ("Account: " + this.acctNumber);
         System.out.println ("Tranfer Amount: " + fmt.format(transfer));
         System.out.println("Available: " + fmt.format(this.balance));
         System.out.println("You cannot transfer negative money");
      }
      else 
        if (transfer > balance)
        {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Transfer Amount: " + fmt.format(transfer));
            System.out.println ("Available: " + fmt.format(balance));
            System.out.println("Your desired transfer amount exceeds your current balance");
        }
        else
        {
        System.out.println ("Account: " + acctNumber);
        System.out.println ("Transfer Amount: " + fmt.format(transfer));
        System.out.println ("Available: " + fmt.format(balance));
        System.out.println ("----------------------------------");
        System.out.println ("Transfer Account Information:");
        System.out.println("Name: " + other.name);
        System.out.println("Account: " + other.acctNumber);
        System.out.println("Balance: " + fmt.format(other.balance));
        this.withdraw(transfer,0);
        other.deposit(transfer);
    }
   }
   //public void 

   /**
   *  Adds interest to the account and returns the new balance.
   */
   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

   /**
   *  Returns the current balance of the account.
   */
   public String getBalance()
   {
       return fmt.format(balance);
    }

   /**
   *  Returns the account number.
   */
   public int getacctNumber()
   {
       return acctNumber;
    }

   /**
   *  Returns a one-line description of the account as a string.
   */
   public String toString ()
   {
      String data = ("Account Name: " + name);
      data+= ("\nAccount Number: " + acctNumber);
      data+= ("\nYour current balance: " + fmt.format(balance));
      return data;
   }
}
