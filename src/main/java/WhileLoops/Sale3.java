/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WhileLoops;

/**
 *
 * @author colep
 */
public class Sale3 {

    public static void main(String[] args) {

        int price = 200; // SELECT INITILISE
        int day = 0;

        while (price > 100) { // TEST (condition)
            //calculation (things to be repeated)
            day = day + 1;
            price = price - 8;

            System.out.println("Day:" + day + "    Price: R" + price);//CHANGE (increment)
        }
    }

}
