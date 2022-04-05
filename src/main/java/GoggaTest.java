import it.Gogga;

public class GoggaTest{
   public static void main (String [] args){
      Gogga bug = new Gogga();
         bug.setPosition(3,1);
         
         //Letter C
         bug.setDirection(Gogga.LEFT);
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.DOWN);
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.RIGHT);
         bug.move();
         bug.move();
         bug.move();
         
         //Letter O
         bug.setPosition(4,1);
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.DOWN);
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.LEFT);
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.UP);
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.move();

         
         //Letter L
         bug.setPosition(8,1);
         bug.setDirection(Gogga.DOWN);
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.RIGHT);
         bug.move();
         bug.move();
         
          //Letter E
         bug.setPosition(14,1);
         bug.setDirection(Gogga.LEFT);
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.DOWN);
         bug.move();
         bug.move();
         bug.move();
         bug.setDirection(Gogga.RIGHT);
         bug.move();
         bug.move();
         bug.move();
         bug.setPosition(11,4);
         bug.setDirection(Gogga.DOWN);
         bug.move();
         bug.move();
         bug.setDirection(Gogga.RIGHT);
         bug.move();
         bug.move();
         bug.move();

         
         




         
         
         
         
         





      
   }  
}