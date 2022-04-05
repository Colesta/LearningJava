import it.*;
import javax.swing.*;
public class Bumps{
   public static void main (String [] args){
   
   Gogga bug = new Gogga();
   bug.setPosition(1,5);
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   bug.move();
   bug.turnLeft();
   bug.move();
   bug.move();
   bug.turnLeft();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   bug.move();
   bug.turnRight();
   bug.move();
   bug.move();
   bug.turnLeft();
   bug.move();
   bug.move();
   
   
   int xPos, yPos;
   
   xPos = bug.getXPos();
   yPos = bug.getYPos();
   
   
   
   System.out.println (xPos);
   System.out.println (yPos);
   
   
   }
}