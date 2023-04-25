/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author colep
 */
public class LinearSearch {
    
    public static void main(String[] args) {
        int num = 5;
        int[] array = {1,4,2,6,7,8,32,5,7,9};
        System.out.println(LinearSearch(array, num));
        
    }
    
    public static int LinearSearch(int[] array, int search) {
        int searchedNum = -1;
        for (int currentPointer = 0; currentPointer < array.length; currentPointer++) {
            if (array[currentPointer] == search){
                searchedNum = currentPointer;
                break;
            }
        }
         
            
    return searchedNum;
    }
}
