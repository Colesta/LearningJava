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
public class AvgGirlsNames {

    public static void main(String[] args) {

        String girlsName = JOptionPane.showInputDialog("Enter girl name");
        int nameLength;
        int totlength = 0;
        int num = 0;
        while (!girlsName.equals("*")) {
            nameLength = girlsName.length();
            totlength += nameLength;
            num += 1;
            girlsName = JOptionPane.showInputDialog("Enter girl name");
        }
        int avgLength = totlength / num;
        System.out.println("Average name length is: " + avgLength);

    }

}
