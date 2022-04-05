import javax.swing.*;
public class SumOfInt{
   public static void main (String [] args){
   
   
   int total;
   
   total = 0;
   
   String loopNum = JOptionPane.showInputDialog("How many numbers do you want to choose");
   
   int loopNum1 = Integer.parseInt(loopNum);
   
   for(int i=1; i<loopNum1; i++)
   {
      
      String input = JOptionPane.showInputDialog("Enter your Number");
      System.out.println(i);
      int inInput = Integer.parseInt(input);
      total += inInput;
       
   System.out.println(input);
   
   }
   
   System.out.println(total);
   
   }
}