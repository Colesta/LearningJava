import  javax.swing.*;
public class StoreAdmin{
   public static void main (String [] args){
   
   String input1, input2, input3;
   
   input1 = JOptionPane.showInputDialog ( "Coca-Cola is R13.90 - How many will you purchase?" );
   input2 = JOptionPane.showInputDialog ( "BarOne's are R12.00 - How many will you purchase?" );
   input3 = JOptionPane.showInputDialog ( "WaterBottles are R9.50 - How many will you purchase?" );
   
   
   double inCoke = Double.parseDouble(input1);
   double inBar = Double.parseDouble(input2);
   double inWater = Double.parseDouble(input3);
   
   double finalCoke = inCoke * 13.90;
   double finalBar = inBar * 12;
   double finalWater = inWater * 9.50;
   
   
   
   double totalPrice = finalCoke + finalBar + finalWater;
   
 
   
   
   System.out.println ("You purchased " + inCoke + " Coca-Cola(s) which will cost: " + finalCoke);
   System.out.println ("You purchased " + inBar + " BarOne(s) which will cost: " + finalBar);
   System.out.println ("You purchased " + inWater + " Water Bottles(s) which will cost: " + finalWater);
   
   System.out.println ("Your total will be: R " + totalPrice); 
   
   




   


   
   
   
   }
}