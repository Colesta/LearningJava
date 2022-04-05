package ForLoops;

import it.*;
public class FirstLoop{
   public static void main (String [] args){
   
   
   Gogga bug = new Gogga();
   bug.setPosition(6,4);
   
   
   for(int i=1; i<10; i++)
   {
   
      bug.turnLeft();
     
     
      for(int y=1; y<=i; y++)
      {
      
      bug.move();
      
      
      
      }

      bug.turnLeft();
      
      for(int y=1; y<=i; y++)
      {
      
      bug.move();
      
      
      
      }
      
   }
      
   }
}