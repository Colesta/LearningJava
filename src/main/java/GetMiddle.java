import javax.swing.*;
public class GetMiddle{
   public static void main (String [] args){
   
   String inputWord;
   
   inputWord = JOptionPane.showInputDialog (" Input a word ");
   int intWord, inputWord1;
   
   
   inputWord1 = Integer.parseInt (inputWord);
   
   intWord = inputWord.length();
   
   
   int wordNum = inputWord1/2;
   
   System.out.println (inputWord.charAt(wordNum));
  
  
   }
}
