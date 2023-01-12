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
public class HeightsTall {

    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        double biggestH = height;

        while (height > 0) {

            if (biggestH < height) {
                biggestH = height;
            }
            height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));

        }

        double finH = Math.round(biggestH * 10) / 10.0;

        System.out.println("The biggest height is" + finH);

    }

}
