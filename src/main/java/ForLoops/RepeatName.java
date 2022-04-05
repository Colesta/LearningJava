/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

import javax.swing.JOptionPane;


/**
 *
 * @author colep
 */
public class RepeatName {
    public static void main(String[] args) {
        String inName = JOptionPane.showInputDialog("Enter your name");
        String loopNum = JOptionPane.showInputDialog("Enter the number of times you want your name repeated");
        
        int loopNum1 = Integer.parseInt(loopNum);
        
        
        for (int i = 0; i<loopNum1; i++) {
            System.out.println(inName);
            
        }
        
        
        
    }
}
