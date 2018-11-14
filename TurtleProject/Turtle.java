import java.util.*;
import java.awt.*;
import java.util.Random;
/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  /**
   * Draws a square of set lenght 20
   */
  public void drawSquare()
  {
      forward(20);
      turnLeft();
      forward(20);
      turnLeft();
      forward(20);
      turnLeft();
      forward(20);
      turnLeft();
      
      
    }
  public void drawSquare(int width)
  {
      forward(width);
      turnLeft();
      forward(width);
      turnLeft();
      forward(width);
      turnLeft();
      forward(width);
      turnLeft();
    }
  /**
   * Draws a rectangle of a given width and height
   * @param height and width
   */
  public void drawRectangle(int width, int height)
  {
      forward(width);
      turnLeft();
      forward(height);
      turnLeft();
      forward(width);
      turnLeft();
      forward(height);
      turnLeft();
      
    }
  /**Draws an equilateral triangle with a given side length
   * @param side
   */
  public void drawEquilateralTriangle(int side)
  {
      forward(side);
      turn(60);
      forward(side);
      turn(-120);
      forward(side);
      turn(-120);
      forward(side);
      
    }
  /**Random walk for the turtle
   * @param steps taken
   */
  public void randomwalk(int steps)
  {
      for(int i = 0; i <steps; i++)
        {
            Random ran = new Random();
            int direction = ran.nextInt(4)+ 1;
            direction = direction * 90;
            turn(direction);
            forward(10);
        }
    }
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
    t1.turn(45);
    t1.forward();
  }

} // this } is the end of class Turtle, put all new methods before this