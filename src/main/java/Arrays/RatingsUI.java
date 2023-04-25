/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.FileNotFoundException;


/**
 *
 * @author colep
 */
public class RatingsUI {
    public static void main(String[] args) throws FileNotFoundException {
        
        Ratings r = new Ratings();
        r.sort();
        
        //r.add(76);
        //r.delete(87);
        System.out.println(r.toString());
        
        System.out.println("NUMBER SUMMARY" + "\n" + "---------------");
        System.out.println("LOWEST: " + r.getFirst());
        System.out.println("HIGHEST: " + r.getLast());
        System.out.println("LOWEST: " + r.getAverage());
        
    }
    
    
    
    
}
