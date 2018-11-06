//********************************************************************
//  Die.java
//
//********************************************************************

import java.util.Random;
public class Die
{
   private final int MIN_FACES = 4;


   private static Random generator = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die (int numFaces)
   //all parameters are local variables 
   {
      if(numFaces < MIN_FACES)
      {
          this.numFaces = 6;
      }
      else
          this.numFaces = numFaces;
      //intfaceValue = 1; //this is a local variable
      faceValue = 1;
   }

   /**
     constructor
     Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random.
     @parm int number of sides of the die
   */
  //constructor does not have a return type 
  public Die(int number_of_faces)
  {
      faceValue = 1;
      if (number_of_faces < MIN_FACES)
      {
          numFaces = 6;
        }
      else
          numFaces = number_of_faces;
      
    }











   /**
        Rolls the die and returns the result.
        @return
   */
   public int roll ()
   {
      
      faceValue = 0; // you put the correct  code here
      return faceValue;
   }

   /**
        Returns the current die value.
        @return _____________________write comment
   */
   public int getFaceValue ()
   {
      return faceValue;
   }


  /**
        Returns the current number of faces the die has.
        @return _________________
  */


  /**
        Sets the number of faces of the Die
        @param _________________
  */



   /**
        Returns the current die value and number of sides as a String.
        @return _____________
   */
   public String methodName ()
   {
      String data ="";



      return data;
   }




}//end of calss Die
