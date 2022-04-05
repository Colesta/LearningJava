import javax.swing.*;
public class Convert2DecPlaces{
   public static void main (String [] args){
   
   String input;
   
   input = JOptionPane.showInputDialog ("Input your number (more than 2 decimals)");
   
   
   double Num, FinalNum, NextNum;
   
   Num = Double.parseDouble(input);
   
   System.out.println ("Your number multiplied by 100 is:  " + (FinalNum = (Num*100)));
   
   System.out.println ("Your number rounded off is: " +  Math.round(FinalNum));
   
   System.out.println ("Your number divided by 100 is:  " + (NextNum = (FinalNum/100)));
     
   }
}