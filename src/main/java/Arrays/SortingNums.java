
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author colep
 */
public class SortingNums {

    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 1, 4, 6, 9, 8, 3, 3, 3, 4, 2, 5, 2, 1};
        int num = Integer.parseInt(JOptionPane.showInputDialog("1-4"));

        switch (num) {
            case 1:
                SelectionSort(nums);
                System.out.println(Arrays.toString(nums));
                break;
            case 2:
                ImprovedSelectionSort(nums);
                System.out.println(Arrays.toString(nums));
                break;
            case 3:
                BubbleSort(nums);
                System.out.println(Arrays.toString(nums));
                break;
            case 4:
                ImprovedBubbleSort(nums);
                System.out.println(Arrays.toString(nums));
                break;
        }

    }

    public static void SelectionSort(int[] array) {
        for (int sortedPointer = 0; sortedPointer < array.length; sortedPointer++) {

            for (int currentPointer = sortedPointer + 1; currentPointer < array.length; currentPointer++) {

                if (array[sortedPointer] > array[currentPointer]) {
                    int temp = array[sortedPointer];
                    array[sortedPointer] = array[currentPointer];
                    array[currentPointer] = temp;
                }
            }
        }

    }

    public static void BubbleSort(int[] array) {
        for (int sortedPointer = array.length - 1; sortedPointer >= 0; sortedPointer--) {
            for (int currentPointer = 0; currentPointer < sortedPointer; currentPointer++) {
                if (array[currentPointer] > array[currentPointer + 1]) {
                    int temp = array[currentPointer];
                    array[currentPointer] = array[currentPointer + 1];
                    array[currentPointer + 1] = temp;
                }
            }
        }
    }

    public static void ImprovedSelectionSort(int[] array) {
        for (int sortedPointer = 0; sortedPointer < array.length; sortedPointer++) {
            int smallestIndex = sortedPointer;

            for (int currentPointer = sortedPointer + 1; currentPointer < array.length; currentPointer++) {
                if (array[currentPointer] < array[smallestIndex]) {
                    smallestIndex = currentPointer;
                }
            }

            if (smallestIndex != sortedPointer) {
                int temp = array[sortedPointer];
                array[sortedPointer] = array[smallestIndex];
                array[smallestIndex] = temp;
            }

        }

    }

    public static void ImprovedBubbleSort(int[] array) {
        for (int sortedPointer = array.length - 1; sortedPointer >= 0; sortedPointer--) {
            boolean sorted = true;
            for (int currentPointer = 0; currentPointer < sortedPointer; currentPointer++) {
                if (array[currentPointer] > array[currentPointer + 1]) {
                    int temp = array[currentPointer];
                    array[currentPointer] = array[currentPointer + 1];
                    array[currentPointer + 1] = temp;
                    sorted = false;
                }
            }
            
            if(sorted){
                break;
            }
        }
    }
}
