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
public class Discount {

    public static void main(String[] args) {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("ENTER AMOUNT SPENT"));

        if (amount > 100) {
            double dis = amount * 0.10;
            amount = amount - dis;

        }
        System.out.println("Your discounted price is:  R" + amount);
    }

}
