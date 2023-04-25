/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author colep
 */
public class IntArrays {
    
    public static void main(String[] args) {
        int[] numbers = {1, 4, 9, 6, 7};
        
        System.out.println("Average Number: " + AverageNum(numbers));   
        System.out.println("Highest Number: " + HighestNum(numbers)); 
        System.out.println("Contains 5: " + ContainsFive(numbers));
     
        }
        
    
    
    public static double AverageNum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    
    public static int HighestNum(int[] array){
        int highestNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highestNum){
                highestNum = array[i];
            }
        }
        return highestNum;
    }
    
    public static boolean ContainsFive(int[] array) {
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5){
                contains = true;
            }
        }
        return contains;
    }
}
    
    
    
  
