import java.text.DecimalFormat;
import java.text.NumberFormat;

//import javax.swing.*;

public class mathy
{
    //class variables (attributes of mathy Class)
    private int area;
    private double pi;
    /**
        default constructor - stubed in
    */
    public mathy( )
    {

        System.out.println ("hi from default constructor");
        pi = 3.1415;

    }//end of default const
    //default constructor takes no parameters 


    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
        */
    public int abs (int x)
    {
       
        if (x<0)
            x = -x;
            
        return x;

    }//end of abs
    /**
     * @return the value of pi
     */
    public double getPi()
    {
        return pi;
    }





    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */


    public int add (int x, int y) //scope of any parameters is in the method only
    {
        int z = x+y;
        return z;


    }//end of add

    /**
        two double parameters and sums them
        @param 2 double values
        @return double sum of values 
     */
    public double add (double x,double y)
    {

        return x+y;
    }
    /**
     * three int parameters and sums them
     * @param 3 int values
     * @return int sum of values
     */
    public int add (int x, int y, int z)
    {
        int a = x+y+z;
        return a;
    }

    /**
            toString
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


}//end of class