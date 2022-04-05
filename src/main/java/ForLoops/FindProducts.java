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
public class FindProducts {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("How many Numbers do you want"));
        int sum = 0;
        for (int i = 0; i < num; i++) {

            int in = Integer.parseInt(JOptionPane.showInputDialog("Enter your num"));

            sum = sum + in;

        }
        System.out.println(sum);
    }

}
