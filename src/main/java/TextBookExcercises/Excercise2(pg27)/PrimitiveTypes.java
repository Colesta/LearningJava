import javax.swing.JOptionPane;
public class PrimitiveTypes{
   
   public static void main(String [] args){
      String birthYearStr, heightStr, phoneNumStr, nameStr, surnameStr;
      int birthYear, height;
      
      nameStr = JOptionPane.showInputDialog("Enter your first name");
      surnameStr = JOptionPane.showInputDialog("Enter your second name");
      birthYearStr = JOptionPane.showInputDialog("Enter the year you new born");
      heightStr = JOptionPane.showInputDialog("Enter your height");
      phoneNumStr = JOptionPane.showInputDialog("Enter your phone number");
      
      birthYear = Integer.parseInt(birthYearStr);
      height = Integer.parseInt(heightStr);
      
      System.out.println();
      System.out.println("PERSONAL DETAILS");
      System.out.println();
      System.out.println("NAME:" + nameStr + surnameStr);
      System.out.println("YEAR OF BIRTH:" + birthYear);
      System.out.println("HEIGHT(m):" + height);
      System.out.println("TELEPHONE NUMBER:" + phoneNumStr);
      
     
     
   }
}