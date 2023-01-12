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
public class StarryBoi {

    public static String oneLine(int length) {

        String star = "";
        for (int i = 0; i < length; i++) {
            star = star + "*";
        }
        return star;
    }

    public static void main(String[] args) {

        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter how tall you want it to be"));
        String star = "*";

        for (int i = 0; i < length; i++) {
            star = oneLine(i);
            System.out.println(star);

        }
        for (int i = length; i > 0; i--) {
            star = oneLine(i);
            System.out.println(star);

        }

    }

}
