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
public class LetterGrade {

    public static void main(String[] args) {

        int mark, markDiv10;

        char grade = 'X';

        mark = Integer.parseInt(JOptionPane.showInputDialog("Type in your mark out of 100"));

        markDiv10 = mark / 10;

        switch (markDiv10) {

            case 8:
            case 9:
            case 10:
                grade = 'A';
                break;

            case 7:
                grade = 'B';
                break;

            case 6:
                grade = 'C';
                break;

            case 5:
                grade = 'D';
                break;

            case 4:
                grade = 'E';
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                grade = 'F';
                break;

            default:
                System.out.println("Mark incorrect, no grade applies");
        }

        JOptionPane.showMessageDialog(null, "Your mark of " + mark + " is the symbol " + grade);

    }

}
