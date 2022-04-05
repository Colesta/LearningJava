import javax.swing.*;

public class ThreeWords{
   public static void main (String [] args){
   
   String word1, word2, word3;
   
   word1 = JOptionPane.showInputDialog("Enter Word 1");
   word2 = JOptionPane.showInputDialog("Enter Word 2");
   word3 = JOptionPane.showInputDialog("Enter Word 3");
   
   System.out.println (word1 + " has " + word1.length() + " characters in it" );
   System.out.println (word2 + " has " + word2.length() + " characters in it" );
   System.out.println (word3 + " has " + word3.length() + " characters in it" );
   
   int letters1, letters2, letters3;
   
   letters1 = word1.length();
   letters2 = word2.length();
   letters3 = word3.length();
   
   System.out.println ("The total number of characters in all of these words are:  " + (letters1 + letters2 + letters3) );


   
   
   
   }
}