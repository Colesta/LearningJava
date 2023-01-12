/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class Older {

    public static void main(String[] args) {

        File f = new File("data//nameAge.txt");

        Scanner sc;
        try {
            sc = new Scanner(f);

            String mosName = "";
            int oldest = 0;

            while (sc.hasNext()) {

                String name = sc.next();
                int age = sc.nextInt();

                if (age > oldest) {
                    mosName = name;
                    oldest = age;

                }
            }

            System.out.println("Oldest boy was " + mosName + " and he is " + oldest + " years old");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Older.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
