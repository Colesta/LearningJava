/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Switch;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class Respond {

    public static void main(String[] args) {
        char ch;

        ch = JOptionPane.showInputDialog("Choose from '1'-sing, '2'-cry, '3'-laugh, 'x'-finish:").toUpperCase().charAt(0);

        switch (ch) {

            case '1':
                System.out.println("La La");
                break;

            case '2':
                System.out.println("Boo hoo");
                break;

            case '3':
                System.out.println("Ha Ha");
                break;

            case 'x':
                System.out.println("See you later");
                break;

            case 'X':
                System.out.println("See you later");
                break;

            default:
                System.out.println("I dont understand");

        }

    }

}
