/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlowChartsPsudoCode;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class SwappingTwoNumbers {

    public static void main(String[] args) {

        int temp;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number"));

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);

    }

}
