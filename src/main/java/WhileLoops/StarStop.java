/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class StarStop {

    public static void main(String[] args) {

        String character = JOptionPane.showInputDialog("Enter Stuff");
        int num = 0;
        while (!character.equals("*")) {
            character = JOptionPane.showInputDialog("Enter Stuff");
            num += 1;
        }
        System.out.println("CHARACTERS ENETERED:  " + num);

    }

}
