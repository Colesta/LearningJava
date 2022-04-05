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
public class Driving {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        if (age < 18) {
            System.out.println("You are too young to drive");
        } else if (age > 75) {
            System.out.println("You are too old to drive");
        } else {
            System.out.println("Age OK. Have you got a driving license?");
        }
    }

}
