/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class Details {

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Enter your name, ID number, height, if you smoke (true or false)");

        Scanner sc = new Scanner(word);

        String name = sc.next();
        String num = sc.next();
        Double height = sc.nextDouble();
        String smoke = sc.next();

        System.out.println("Name: " + name);
        System.out.println("ID Number: " + num);
        System.out.println("Height: " + height);
        System.out.println("Smokes: " + smoke);

    }

}
