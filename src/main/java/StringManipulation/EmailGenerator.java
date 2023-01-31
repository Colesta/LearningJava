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
public class EmailGenerator {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your First name and your Last name");
        
        String FName = name.substring(0, 3);
        
                
        int LNameNum = name.lastIndexOf(" ");
        
        String LName = name.substring(LNameNum + 1, LNameNum + 4);
        
        String RandNum1 = ((int)(Math.random() * 90 ) + 10) + "";
        
        System.out.println(LName + FName.toLowerCase() + RandNum1 + "@reddam.house" );
        
        // [0, 1)
        
        //[10,99]
        //[10,100)
    }
    
    
    
}
