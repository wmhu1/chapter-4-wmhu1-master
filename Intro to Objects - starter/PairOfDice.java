// student outline of Pair of Dice
import java.util.Random;
public class PairOfDice
{
   private final int MIN_FACES = 4;
   private static Random generator = new Random();
   private int numFaces1, numFaces2,total;   // number of sides on the die
   private int faceValue1, faceValue2;  // current value showing on the die

    //private data-- 2 die





    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */
   public PairOfDice()
   {
       
       numFaces1 = 6;
       faceValue1 = 1;
       numFaces2 = 6;
       faceValue2 = 1;
    }
       


    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return
    */
   public int roll()
   {
       faceValue1 = generator.nextInt(numFaces1)+1;
       faceValue2 = generator.nextInt(numFaces2)+1;
       total = faceValue1+faceValue2;
       return total;
    }

    /**-------------- getTotal()
        Returns the current combined dice total.
        @return
    */
   public int getTotal()
   {
       return total;
    }



    /**---------------- getDie1()
        Returns the current value of the first die.
        @return
    */
   public int getDie1()
   {
       return faceValue1;
    }

    /**------------- getDie2()
        Returns the current value of the second die.
        @return
    */
   public int getDie2()
   {
       return faceValue2;
    }
    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */
   public String toString()
   {
       String data = "Face Value 1: "+faceValue1; 
       data +="\nFace Value 2: " + faceValue2;
       data+= "\nTotal: " +total;
       return data;
    }



}
