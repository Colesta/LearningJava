/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author colep
 */
public class Ratings {

    private int[] ratings;
    private int size;

    public Ratings() {
        ratings = new int[150];
        size = 0;

        try {
            Scanner scFile = new Scanner(new File("data//ratings.txt/"));
            while (scFile.hasNextInt()) {
                ratings[size] = scFile.nextInt();
                size++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ratings.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void add(int value) {
        int replaceNum = size;
        int sortIndex = 0;
        
        for (int i = 0; i < size; i++) {
            int currentNum = ratings[i];
            
            if(currentNum > value){
                sortIndex = i;
                break;
            }
            
        }
        
        for (int j = size; j >= sortIndex; j--) {
            ratings[j] = ratings[j - 1];
            replaceNum = j;
            

        }
        
        ratings[replaceNum] = value;
        

    }

    public void delete(int index) {
        int deleteNum;
        for (int i = 0; i < size; i++) {
            deleteNum = ratings[i];
            
            if (deleteNum == index){
                for (int j = i; j < size; j++) {
                    ratings[j] = ratings[j+1];
                }
                size = size-1;
              break;
            }
           
            
        }

    }

    public void sort() {
        for (int sortedPointer = size - 1; sortedPointer >= 0; sortedPointer--) {
            boolean sorted = true;
            for (int currentPointer = 0; currentPointer < sortedPointer; currentPointer++) {
                if (ratings[currentPointer] > ratings[currentPointer + 1]) {
                    int temp = ratings[currentPointer];
                    ratings[currentPointer] = ratings[currentPointer + 1];
                    ratings[currentPointer + 1] = temp;
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }
    }

    @Override
    public String toString() {

        String out = "[";
        for (int i = 0; i < size; i++) {
            out += ratings[i] +" ";
        }

        return out + "]";
    }

    public int getSize(){
        return size;
    }
    
    public int getElement(int index){
        return ratings[index];
    }
    
    public int getFirst(){
        return ratings[0];
    }
 
     public int getLast(){
        return ratings[size - 1];
    }
     
     public double getAverage(){
         int tot = 0;
         int nums = 0;
         double average;
         for (int i = 0; i <= size; i++) {
             tot += ratings[i];
             nums += 1;
         }
         average = tot / nums;
         
         return average;
     }
}


