/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Math;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class LargerOfTwo {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your First Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Second Number"));

        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        }
        if (num1 < num2) {
            System.out.println(num2 + " is bigger than " + num1);
        }
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        }

    }

}
