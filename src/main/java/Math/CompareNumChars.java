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
public class CompareNumChars {

    public static void main(String[] args) {
        String wrd1 = JOptionPane.showInputDialog("Enter your first word");
        String wrd2 = JOptionPane.showInputDialog("Enter your second word");

        int wrd1length = wrd1.length();
        int wrd2length = wrd2.length();

        if (wrd1length > wrd2length) {
            System.out.println(wrd1 + " has more leters than " + wrd2);
        } else if (wrd2length > wrd1length) {
            System.out.println(wrd2 + " has more letters thans " + wrd1);
        } else if (wrd1length == wrd2length) {
            System.out.println(" salted butter");
        }
    }

}
