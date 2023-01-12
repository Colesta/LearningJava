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
public class Prices {

    public static void main(String[] args) {
        System.out.println("WELCOME TO CHECKERS \n PRICES:");
        double totPrice = 0;
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price of the Product")); // SELECT INITILISE
        while (price != 0) { // TEST (condition)
            System.out.println("R " + price);
            //calculation (things to be repeated)
            totPrice = totPrice + price;
            price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price of the Product")); //CHANGE (increment)
        }
        //Post processing section (once after)
        System.out.println("YOUR TOTAL: R" + totPrice);
    }

}
