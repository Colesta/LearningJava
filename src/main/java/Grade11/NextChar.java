/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grade11;

import javax.swing.JOptionPane;

/**
 *
 * @author Colep
 */
public class NextChar {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("Enter a word");
        
        
        for (int i = 0; i < word.length(); i++) {
            
            int letter = word.charAt(i);
            letter += 1;
            char nextChar = (char) letter;
            System.out.print(letter);
            
        }
    }
    
}
