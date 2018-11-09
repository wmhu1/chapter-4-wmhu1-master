//test the Pair of Dice



public class BoxCars
{

public static void main (String[] args)
{
	//Rolls a pair of dice multiple times, counting the number of
	//box cars (two sixes) that occur.
	final int ROLLS = 1000, TARGET = 12;
	int total, count = 0;

	PairOfDice dice = new PairOfDice();

	for (int i=0; i < ROLLS; i++)
	{
		total = dice.roll();

		if( total == TARGET )
			count++;

	}
	System.out.println("Number of rolls:    " + ROLLS  );
	System.out.println("Number of BoxCars:  "  + count  );

	//call the get methods and toString of dice
	System.out.println("Die 1 Face Value: " + dice.getDie1());
	System.out.println("Die 2 Face Value: " + dice.getDie2());
	System.out.println("To String: " + dice.toString());



}//end of main
}//end ofclass