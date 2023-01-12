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
public class AddInts {

    public static void main(String[] args) {
        int sum = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Num")); // SELECT INITILISE
        while (num != -99) { // TEST (condition)
            //calculation (things to be repeated)
            sum = sum + num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Num")); //CHANGE (increment)

        }
        //Post processing section (once after)
        System.out.println(sum);
    }

}
