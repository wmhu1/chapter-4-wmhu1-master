

public class RationalNumbers
{
   //-----------------------------------------------------------------
   //  Creates some rational number objects and performs various
   //  operations on them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
       //create Rational numbers
      Rational r1 = new Rational (6, 8);
      Rational r2 = new Rational (1, 3);
      Rational r3, r4, r5, r6, r7;
      System.out.println ("First rational number: " + r1);
      System.out.println ("Second rational number: " + r2);

        //are the rational numbers equal?
      if (r1.equals(r2) == true)
         System.out.println ("r1 and r2 are equal.");
      else
         System.out.println ("r1 and r2 are NOT equal.");

      r3 = r1.reciprocal(); //reciprocal of r1
      System.out.println ("The reciprocal of r1 is: " + r3);

      r4 = r1.add(r2);//add r1 & r2
      r5 = r1.subtract(r2);//subtract r1 & r2
      r6 = r1.multiply(r2);//multiply r1 & r2
      r7 = r1.divide(r2);//divide r1 & r2;

      System.out.println (r1 + " + " + r2 + " = " + r4);
      System.out.println (r1 + " - " + r2 + " = " + r5);
      System.out.println (r1 + " * " + r2 + " = " + r6);
      System.out.println (r1 + " / " + r2 + " = " + r7);
   }
}
