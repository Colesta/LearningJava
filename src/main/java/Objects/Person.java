/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author colep
 */
public class Person {
    
    private String name;
    private String surename;
    
    
    public Person(String name, String surname){
        this.name = name;
        this.surename = surname;
    }
    

     public String generateEmail(){
        
        return this.name + this.surename + "@gmail.com";
    }
    
}
