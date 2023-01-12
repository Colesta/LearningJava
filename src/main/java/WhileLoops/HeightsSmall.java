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
public class HeightsSmall {

    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));
        double smallestH = height;

        while (height > 0) {

            if (smallestH > height) {
                smallestH = height;
            }
            height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height"));

        }

        double finH = Math.round(smallestH * 10) / 10.0;

        System.out.println("The smallest height is" + finH);

    }

}
