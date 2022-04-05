import javax.swing.JOptionPane;
public class Prices{
   public static void main (String [] args){
   String firstProductStr, secondProductStr, thirdProductStr, firstPriceStr, secondPriceStr, thirdPriceStr;
   double price1;
   double price2;
   double price3;
   
   firstProductStr = JOptionPane.showInputDialog("Enter your first product");
   firstPriceStr = JOptionPane.showInputDialog("Enter the price for the product");
   
   secondProductStr = JOptionPane.showInputDialog("Enter your second product");
   secondPriceStr = JOptionPane.showInputDialog("Enter the price for the product");
   
   thirdProductStr= JOptionPane.showInputDialog("Enter your third product");
   thirdPriceStr = JOptionPane.showInputDialog("Enter the price for the product");
   
   price1 = Double.parseDouble(firstPriceStr);
   price2 = Double.parseDouble(secondPriceStr);
   price3 = Double.parseDouble(thirdPriceStr);

   
   
   System.out.println();
   System.out.println("SHOPPING LIST:");
   System.out.println();
   System.out.println(firstProductStr + " R" + price1);
   System.out.println(firstProductStr + " R" + price2);
   System.out.println(firstProductStr + " R" + price3);
   System.out.println();
   System.out.println(("TOTAL:") + (price1 + price2 + price3));


   



   
  }

}
   