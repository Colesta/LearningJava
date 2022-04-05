import javax.swing.JOptionPane;

public class NumberDataTypes{
   public static void main (String [] args){
  
   
      String input1 = JOptionPane.showInputDialog ("enter the first number");
      String input2 = JOptionPane.showInputDialog ("enter the second number");
      
      int num1 = Integer.parseInt (input1);
      double num2 = Double.parseDouble (input2);
      
      System.out.println (" the sum of the numbers is " + (num1 + num2));
      
    
      
   } 
}