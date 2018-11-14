import java.util.*;

public class TurtleTest
{
  public static void main(String[] args)
  {
    Random randNumGen = new Random();
    World world = new World(false);
    Turtle[] turtleArray = new Turtle[50];
    for (int i=0; i < 50; i++)
      turtleArray[i] = new Turtle(world);
    
    for (int i=0; i < 50; i++)
    {
      turtleArray[i].turn(randNumGen.nextInt(360));
      turtleArray[i].forward(100);
      //turtleArray[i].drawSquare(100);
      //turtleArray[i].drawRectangle(10,50);
      //turtleArray[i].drawEquilateralTriangle(50);
      turtleArray[i].randomwalk(100);
    }
    world.setVisible(true);
    
  }
}