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
public class XXX {

    public static void main(String[] args) {

        String ma = "";
        int i = 0;
        int tl = 0;

        String name = "";

        while (!name.equals("xxx")) {

            name = JOptionPane.showInputDialog("Enter a name");
            char name1 = name.charAt(0);
            char ma1 = ma.charAt(0);
            tl = tl + name.length();
            i += 1;
            if (ma.compareTo(name) > 0) {
            }
            ma = name;

        }
        int avg = tl / i;
        System.out.println("Average length of the names is: " + avg);
        System.out.println("Most alphabetical name is " + ma);
    }

}
