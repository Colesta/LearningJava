/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonObject;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author colep
 */
public class Person {

    private int id;
    private String firstName;
    private String surname;
    private double weight;
    private double height;

    public Person(int inID, String inFirstName, String inSurname, double inWeight, double inHeight) {
        id = inID;
        firstName = inFirstName;
        surname = inSurname;
        weight = inHeight;
        height = inHeight;

    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String inName) {
        firstName = inName;
    }
    
     public String getSurname() {
        return surname;
    }

    public void setSurname(String inSurname) {
        surname = inSurname;
    }
    
     public int getID() {
        return id;
    }

    public void setID(int inID) {
        id = inID;
    }
    
     public double getWeight() {
        return weight;
    }

    public void setWeight(double inWeight) {
        weight = inWeight;
    }
    
     public double getHeight() {
        return height;
    }

    public void setHeight(double inHeight) {
        height = inHeight;
    }

    
    
    
    public double BMI() {
        return weight / (height * height);
    }

    public String getEmail() {
        return surname + "." + firstName + "@" + "gmail.com";
    }
    
    @Override
    public String toString(){
        return (id + "") + firstName + surname + (weight + "") + (height + "");
    }

}
