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
public class TestAnotherNumber {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));

        if (num >= 0) {
            System.out.println("This number is POSITIVE");
        } else {
            System.out.println("This number is NEGATIVE");

        }
        if (num % 2 == 0) {
            System.out.println("This number is EVEN");

        } else {
            System.out.println("This number is ODD");

        }
        if (num % 7 == 0) {
            System.out.println("This number is a multiple of 7");

        } else {
            System.out.println("This number is NOt a multiple of 7");

        }

    }
}
