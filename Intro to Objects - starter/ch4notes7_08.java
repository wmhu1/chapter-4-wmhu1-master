/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08
{

 //static int sum = 987654;

public static void main (String[] args)
{

    mathy solver = new mathy(); //mathy() is the default constructor

    System.out.println(solver.abs(-5));
    System.out.println(abs(-8));
    System.out.println(solver.add(5,10,20));
    System.out.println(solver.getPi());
    
    Address my_home = new Address("916 Elm St.","Flossmoor","IL",60422);
    Address marks_home = new Address("712 Maple Ave.","Flossmoor","IL",60422);
    Address sister = new Address(my_home);
    System.out.println(sister_home);

/**/
}// end of main

/**
    take the absoulute value of the number
    @param int value
    @return absoulute value of number
*/
public static int abs (int x)
{
    if (x < 0)
        x = -x;

    return x;

}//end of abs

/**
    take the absoulute value of the number
    @param double value
    @return absoulute value of number
*/
public static double abs (double x)
{
    if (x < 0)
        x = -x;

    return x;



}//end of abs





public static int add (int x, int y)
{   //System.out.println(sum );
    int sum;      //sum x and y are local var
    sum = x+y;

    return sum;


}//end of add


}// end of class









