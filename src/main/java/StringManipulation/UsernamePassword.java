/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class UsernamePassword {

    public static boolean CheckLogin(String userIn, String passIn) {

        boolean access = false;

        try {
            File f = new File("data\\usernamePass.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String user = lineSc.next();
                String pass = lineSc.next();

                if (userIn.equals(user) && passIn.equals(pass)) {
                    access = true;
                    break;

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Older.class.getName()).log(Level.SEVERE, null, ex);
        }
        return access;
    }

    public static void addUser(String userIn, String passIn) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("data\\usernamePass.txt", true));
        pw.print("\n" + userIn + "#" + passIn);
        pw.close();

    }

    public static void main(String[] args) throws IOException {
        int meth = Integer.parseInt(JOptionPane.showInputDialog("Do you want to LOG IN or REGISTER a new account (1 = LOG IN) (2 + REGISTER)"));

        String userIn = JOptionPane.showInputDialog("Enter your username");
        String passIn = JOptionPane.showInputDialog("Enter your password");

        switch (meth) {
            case 1:
                if (CheckLogin(userIn, passIn)) {
                    System.out.println("ACCESS GRANTED. WELCOME " + userIn);

                } else {
                    System.out.println("ACCESS DENIED.");
                }
                break;
            case 2:
                addUser(userIn, passIn);
                System.out.println("Thank you for registering");
                break;
            default:
                System.out.println("INVALID INPUT");

        }
    }

}
