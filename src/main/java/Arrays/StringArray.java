/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author colep
 */
public class StringArray {
    
    public static void main(String[] args) {
        
        String[] names = {"Cole", "Derek", "Zoolander", "AilA", "Jordan"};
        
    }
    
    public static String mostAlphabetical(String[] array){
        String mosA = array[1];
        for (int i = 1; i < array.length; i++) {
            if (mosA.compareTo(array[i]) < 0){
                mosA = array[i];
            }
        }
        return mosA;
    }
    
}
