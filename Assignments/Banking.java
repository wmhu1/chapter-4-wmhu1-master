//********************************************************************
//  Banking.java       Author: Lewis/Loftus/Cocking
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************
import java.util.Scanner;
public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Anita Gomez", 69713, 40.00);
      Account acct3 = new Account ("Sanchit Reddy", 93757, 759.32);
      Scanner keyboard = new Scanner(System.in);
      System.out.println(acct2.toString());
      System.out.println("Welcome to Bank of Naperville, what would you like to do today?");
      System.out.println("1.) Deposit\t2.) Withdraw\t3.) Transfer\t4.) Exit");
      int choice = keyboard.nextInt();
      
      while (choice !=4)
      {
          if (choice == 1)
          {
              System.out.println("Very well, you have decided to deposit. How much money would you like to deposit?");
              double deposit = keyboard.nextDouble();
              acct2.deposit(deposit);
              System.out.println ("Gomez balance after deposit: "+ acct2.getBalance());
              System.out.println("Would you like to do anything else today?");
              System.out.println("1.) Deposit\t2.) Withdraw\t3.) Transfer\t4.) Exit");
              choice = keyboard.nextInt();
              
            }
          if (choice == 2)
          {
              System.out.println("Very well, you have decided to withdraw. How much money would you like to withdraw?");
              double withdraw = keyboard.nextDouble();
              acct2.withdraw(withdraw,1.25);
              System.out.println ("Gomez balance after deposit: "+ acct2.getBalance());
              System.out.println("Would you like to do anything else today?");
              System.out.println("1.) Deposit\t2.) Withdraw\t3.) Transfer\t4.) Exit");
              choice = keyboard.nextInt();
            }
          if (choice == 3)
          {
              System.out.println("Very well, you have decided to transfer." );
              System.out.println("Your balance: "+ acct2.getBalance());
              System.out.println("Sanchit Balance: "+ acct3.getBalance());
              acct2.transfer(acct3);
              System.out.println("Anita Balance: "+ acct2.getBalance());
              System.out.println("Sanchit Balance: "+ acct3.getBalance());
              System.out.println("Would you like to do anything else today?");
              System.out.println("1.) Deposit\t2.) Withdraw\t3.) Transfer\t4.) Exit");
              choice = keyboard.nextInt();
          }
          System.out.println(acct2.toString());
          System.out.println("Thank you.\n");
          System.out.println("Have a nice day!");
          

   }
}
}
