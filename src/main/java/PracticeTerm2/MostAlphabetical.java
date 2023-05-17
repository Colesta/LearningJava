/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeTerm2;

/**
 *
 * @author colep
 */
public class MostAlphabetical {
    public static void main(String[] args) {
        String[] array = {"A", "B",};
        
        if (array[1].compareTo(array[0]) > 0){
            System.out.println(array[0] + " is more alpha than " + array[1]);
        }else{
            System.out.println(array[1] + " is more alpha than " + array[0]);
        }
    }
    
}
