/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;

/**
 *
 * @author colep
 */
public class Dice {

    public static int getDiceNum(int min, int max) {
        int range = max - min;

        return (int) (Math.random() * range) + min;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int diceNum = getDiceNum(6, 1);
            System.out.println(diceNum);

        }
    }

}
