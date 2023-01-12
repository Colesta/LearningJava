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
public class Rainfall {

    public static void main(String[] args) {

        int rainfall = Integer.parseInt(JOptionPane.showInputDialog("Enter Rainfall (mm)"));
        int totRain = 0;
        int day = 0;

        while (rainfall > -1) {

            rainfall = Integer.parseInt(JOptionPane.showInputDialog("Enter Rainfall (mm)"));
            totRain += rainfall;
            day += 1;

        }

        int avg = totRain / day;

        System.out.println("Total Rainfall: " + totRain);
        System.out.println("Average Daily Rainfall: " + avg);

    }

}
