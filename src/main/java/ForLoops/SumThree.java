/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ForLoops;

/**
 *
 * @author colep
 */
public class SumThree {

    public static void main(String[] args) {

        int num, num1;

        for (int i = 12; i > 0; i--) {

            num = i * 3;
            System.out.println(num);

            num1 = num;
            double num2 = num1 % 5;

            if (num2 == 0) {
                System.out.println("THIS IS A MULTIPLE OF 5" + num1);

            }

        }
    }

}
