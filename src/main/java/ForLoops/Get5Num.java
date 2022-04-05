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
public class Get5Num {

    public static void main(String[] args) {

        String in, loopNum1;
        int loopNum, in1, tot;
        loopNum1 = JOptionPane.showInputDialog("How many numbers would you like to choose?");
        loopNum = Integer.parseInt(loopNum1);

        for (int i = 0; i < loopNum; i++) {
            in = JOptionPane.showInputDialog("Enter your Number");
            System.out.println(in);

        }

    }

}
