/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonObject;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class PersonUI {

    public static void main(String[] args) throws FileNotFoundException {
        PersonManager pm = new PersonManager();

        System.out.println("CHOOSE AN OPTION");
        System.out.println("================");
        System.out.println("1: Get First Name\n" + "2: Get Surname\n" + "3: Generate Email\n" + "4: Get Average Weight\n" + "5: Get Average Height\n" + "6: Generate BMI\n");

        int option = Integer.parseInt(JOptionPane.showInputDialog("Choose 1-6"));
        int ID;

        switch (option) {
            case 1:
                ID = Integer.parseInt(JOptionPane.showInputDialog("Choose ID"));
                System.out.println(pm.getFirstName(ID));
                break;
            case 2:
                ID = Integer.parseInt(JOptionPane.showInputDialog("Choose ID"));
                System.out.println(pm.getSurename(ID));
                break;
            case 3:
                ID = Integer.parseInt(JOptionPane.showInputDialog("Choose ID"));
                System.out.println(pm.getEmail(ID));
                break;
            case 4:
                System.out.println(pm.getAverageWeight());
                break;
            case 5:
                System.out.println(pm.getAverageHeight());
                break;
            case 6:
                System.out.println(pm.getAverageBMI());
                break;

        }

    }

}
