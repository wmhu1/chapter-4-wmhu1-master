//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int s1;
   private int s2;
   private int s3;
   private int average;
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   int score1,int score2,int score3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = new Address ("440 W. Aurora Ave", "Naperville",
                                    "IL",60540);
      s1 = score1;
      s2 = score2;
      s3 = score3;
   }
   public Student (String first, String last, Address home)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = new Address ("440 W. Aurora Ave", "Naperville",
                                    "IL",60540);
      s1 = 0;
      s2 = 0;
      s3 = 0;
   }
   public void setTestScore(int testnum, int score)
   {
       if (testnum == 1)
       {
           s1 = score;
        }
       if (testnum == 2)
       {
           s2 = score;
        }
       if (testnum == 3)
       {
           s3 = score;
        }
    }
   public int getTestScore(int testnum)
   {
       int testscore = 10;
       if (testnum == 1)
           testscore = s1;
        
       else if (testnum == 2)
           testscore = s2;
        
       else if (testnum == 3)
           testscore = s3;
       else
           System.out.println("You have entered an incorrect test number, your score has been set to 10");
       return testscore;
        
    }
   public int average(int score1,int score2, int score3)
   {
       s1 = score1;
       s2 = score2;
       s3 = score3;
       average = (s1 + s2 + s3) / 3;
       return average;
    }
   public boolean equals(Student other)
   {
       return(firstName.equals(other.firstName) && homeAddress.equals(other.homeAddress));
    }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = "\n"+firstName + " " + lastName;
      result += "\nSchool Address:\n" + schoolAddress + "\n";
      result += "\nHome Address:\n" + homeAddress + "\n";
      result += "\nTest 1:" + s1 + "\tTest 2:" + s2 + "\tTest 3:"+ s3;
      result += "\tTest Average:" + average;
      return result;
   }
}
