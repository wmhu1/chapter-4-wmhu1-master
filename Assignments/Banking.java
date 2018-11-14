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
      System.out.println("Hello, welcome to Bank of Naperville, what would you like to do today?");
      System.out.println("1.) Deposit\t2.) Withdraw\t3.) Transfer\t4.) Exit");
      int choice = keyboard.nextInt();
      while (choice !=4)
      {
          if (choice == 1)
          {
              
            }
          acct1.deposit (25.85);
    
          double gomezBalance = acct2.deposit (500.00);
          System.out.println ("Gomez balance after deposit: " +
                              gomezBalance);
    
          System.out.println ("Gomez balance after withdrawal: " +
                              acct2.withdraw (430.75, 1.50));
    
          //acct3.withdraw (800.00, 0.0);  // exceeds balance
          System.out.println("Account 1: "+ acct1.getBalance());
          System.out.println("Account 3: "+ acct3.getBalance());
          acct1.transfer(acct3);
          System.out.println("Account 1: "+acct1.getBalance());
          System.out.println("Account 3: "+acct3.getBalance());
          
          /*acct1.addInterest();
          acct2.addInterest();
          acct3.addInterest();
          
          System.out.println ();
          System.out.println (acct1);
          System.out.println (acct2);
          System.out.println (acct3);
          */
   }
}
}
