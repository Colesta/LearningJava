/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class RemoveVowels {
    public static void main(String[] args) {
        //get input
        //get letters to remove
        
        //create output
        
        //for each letter in input
        //if letters to remove NOT contains letter
        //add to output
        
        //return output
        
       String word = JOptionPane.showInputDialog("Enter a Word");
       String vowel = "aeiou";
       
       String out = "";
       
        for (int i = 0; i < word.length() ; i++) {
            
            if (!vowel.contains(word.charAt(i)+ "")){ 
                
                out += word.charAt(i);
                
            }
            
        }
        System.out.println(out);
    }
            
}
