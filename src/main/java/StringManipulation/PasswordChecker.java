/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringManipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class PasswordChecker {

    public static void main(String[] args) {

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String pass = JOptionPane.showInputDialog("Enter your password");
        int strCount = 0;

        for (int i = 0; i < pass.length() - 1; i++) {
            char ch = pass.charAt(i);

            

            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else  {
                hasSpecial = true;

            }

        }
        
        if (pass.length() >= 8 && hasLower && hasUpper && hasDigit && hasSpecial) {
                System.out.println("Strong");
            }
        else{
            System.out.println("Weak");
        }
   

    }

}
