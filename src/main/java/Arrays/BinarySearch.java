/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.LinearSearch.LinearSearch;

/**
 *
 * @author colep
 */
public class BinarySearch {

    public static void main(String[] args) {
        int num = 5;
        int[] array = {1, 4, 2, 6, 7, 8, 32, 5, 7, 9};
        int[] sortedArray = BubbleSort(array);
        System.out.println(BinarySearch(sortedArray, num));
       
    }

    public static int[] BubbleSort(int[] array) {
        for (int sortedPointer = array.length - 1; sortedPointer >= 0; sortedPointer--) {
            for (int currentPointer = 0; currentPointer < sortedPointer; currentPointer++) {
                if (array[currentPointer] > array[currentPointer + 1]) {
                    int temp = array[currentPointer];
                    array[currentPointer] = array[currentPointer + 1];
                    array[currentPointer + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int BinarySearch(int[] array, int searchedArray) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (array[middle] == searchedArray) {
                return middle;
                
            } else if (array[middle] > searchedArray) {
                end = middle - 1;
                
            } else {
                 start = middle + 1;

            }

        }
        
        
        return -1;

    }

}
