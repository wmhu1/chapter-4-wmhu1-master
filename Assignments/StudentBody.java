//********************************************************************
//Will Hu
//Student Program Main
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************
import java.util.Scanner;
public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String address;
      String first;
      String last;
      String city;
      String state;
      int zipcode;
      int s1=0;
      int s2=0;
      int s3=0;
      System.out.println("Hello, please enter your first name.");
      first = keyboard.nextLine();
      System.out.println("Please enter your last name.");
      last = keyboard.nextLine();
      System.out.println("Please enter your street address");
      address = keyboard.nextLine();
      System.out.println("Please enter your city");
      city = keyboard.nextLine();
      System.out.println("Please enter your state");
      state = keyboard.nextLine();
      System.out.println("Please enter your 6 digit zip code");
      zipcode = keyboard.nextInt();
      System.out.println("Please enter your 3 test scores");
      s1 = keyboard.nextInt();
      s2 = keyboard.nextInt();
      s3 = keyboard.nextInt();
      
      Address useraddress = new Address(address,city,state,zipcode);
      Student user = new Student(first,last, useraddress, s1,s2,s3);
      user.average(s1,s2,s3);
      System.out.println (user);
      
      Address lisaaddress = new Address("123 LoudMouth","Springfield","IL",60231);
      Student lisa = new Student("Lisa","Simpson",lisaaddress,75,85,65);
      lisa.average(75,85,65);
      System.out.println(lisa);
      
      Address bartaddress = new Address("123 LoudMouth","Springfield","IL",60231);
      Student bart = new Student("Bart","Simpson",bartaddress,45,35,25);
      bart.average(45,35,25);
      System.out.println(bart);
      
      if (lisa.equals(bart))
        System.out.println("Student 1 is the same as Student 2");
      else
        System.out.println("These students are not the same");
      
   }
}
