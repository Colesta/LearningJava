/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision.Term3;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class CheckSecret {

    public static void main(String[] args) {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Enter a positive integer"));

        if (num % 7 == 0 && num % 2 == 0) {
            System.out.println("You may enter");
        } else {
            System.out.println("You may NOT enter!");
        }

    }

}
