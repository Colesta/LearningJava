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
public class ReverseWord {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("Enter a Word");
        
        int lastLet = word.length();
        
        String output = "";
        
        for (int i = lastLet - 1; i >= 0; i--) {
            char Letter = word.charAt(i);
            output += Letter;
            
        }
        
        System.out.println(output);
        
        
        
    }
    
}
