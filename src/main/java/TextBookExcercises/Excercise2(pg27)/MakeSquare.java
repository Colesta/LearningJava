import it.*;
import javax.swing.JOptionPane;
public class MakeSquare{


   public static void main(String [] args){
      Gogga bug = new Gogga();
      String widthStr;
      int width;
      
      
      widthStr = JOptionPane.showInputDialog("Enter the trail width you want");
      width = Integer.parseInt(widthStr);
      
      bug.setTrailWidth(width);
         bug.move();      
      
      
      
      
   
   }
}