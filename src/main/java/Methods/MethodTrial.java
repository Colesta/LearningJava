/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class MethodTrial {

    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        int num3 = getNum();

    }

    static void Colour() {
        String col = JOptionPane.showInputDialog("What is your favourite colour");

    }

    static void Letter() {
        String col = JOptionPane.showInputDialog("What is your favourite colour");

    }

    static void Number() {
        String col = JOptionPane.showInputDialog("What is your favourite number");

    }

    public static int getNum() {

        String input = JOptionPane.showInputDialog("What is your favourite number");
        int num = Integer.parseInt(input);

        return num;
    }

}
