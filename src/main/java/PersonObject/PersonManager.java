/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author colep
 */
public class PersonManager {

    public static String getEmail(int id) throws FileNotFoundException {
        //open file
        Scanner scFile = new Scanner(new File("src/main/java/PersonObject/people.txt"));

        //scan through file
        while (scFile.hasNext()) {
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line);
            scLine.useDelimiter("#");
            int inID = Integer.parseInt(scLine.next());
            String inFirstName = scLine.next();
            String inSurname = scLine.next();
            double inWeight = Double.parseDouble(scLine.next());
            double inHeight = Double.parseDouble(scLine.next());

            Person p = new Person(inID, inFirstName, inSurname, inWeight, inHeight);

            if (p.getID() == id) {
                return p.getEmail();
            }

        }

        return null;
    }
    
    public static String getFirstName(int id) throws FileNotFoundException {
        //open file
        Scanner scFile = new Scanner(new File("src/main/java/PersonObject/people.txt"));

        //scan through file
        while (scFile.hasNext()) {
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line);
            scLine.useDelimiter("#");
            int inID = Integer.parseInt(scLine.next());
            String inFirstName = scLine.next();
            String inSurname = scLine.next();
            double inWeight = Double.parseDouble(scLine.next());
            double inHeight = Double.parseDouble(scLine.next());

            Person p = new Person(inID, inFirstName, inSurname, inWeight, inHeight);

            if (p.getID() == id) {
                return p.getFirstName();
            }

        }

        return null;
    }
    
    public static String getSurename(int id) throws FileNotFoundException {
        //open file
        Scanner scFile = new Scanner(new File("src/main/java/PersonObject/people.txt"));

        //scan through file
        while (scFile.hasNext()) {
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line);
            scLine.useDelimiter("#");
            int inID = Integer.parseInt(scLine.next());
            String inFirstName = scLine.next();
            String inSurname = scLine.next();
            double inWeight = Double.parseDouble(scLine.next());
            double inHeight = Double.parseDouble(scLine.next());

            Person p = new Person(inID, inFirstName, inSurname, inWeight, inHeight);

            if (p.getID() == id) {
                return p.getSurname();
            }

        }

        return null;
    }
    
    public static double getAverageWeight() throws FileNotFoundException {
        int numPeeps = 0;
        double totWeight = 0;
        double avgWeight;
        Scanner scFile = new Scanner(new File("src/main/java/PersonObject/people.txt"));

        while (scFile.hasNext()) {
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line);
            scLine.useDelimiter("#");
            int inID = Integer.parseInt(scLine.next());
            String inFirstName = scLine.next();
            String inSurname = scLine.next();
            double inWeight = Double.parseDouble(scLine.next());
            double inHeight = Double.parseDouble(scLine.next());
            
            Person p = new Person(inID, inFirstName, inSurname, inWeight, inHeight);
            
            totWeight += p.getWeight();
            numPeeps += 1;
        }
        
        avgWeight = totWeight / numPeeps;

        return avgWeight;
    }
    
    public static double getAverageHeight() throws FileNotFoundException {
        int numPeeps = 0;
        double totHeight = 0;
        double avgHeight = 0;
        Scanner scFile = new Scanner(new File("src/main/java/PersonObject/people.txt"));

        while (scFile.hasNext()) {
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line);
            scLine.useDelimiter("#");
            int inID = Integer.parseInt(scLine.next());
            String inFirstName = scLine.next();
            String inSurname = scLine.next();
            double inWeight = Double.parseDouble(scLine.next());
            double inHeight = Double.parseDouble(scLine.next());
            
            Person p = new Person(inID, inFirstName, inSurname, inWeight, inHeight);
            
            totHeight += p.getHeight();
            numPeeps += 1;
        }
        
        avgHeight = totHeight / numPeeps;

        return avgHeight;
    }
    
    public static double getAverageBMI() throws FileNotFoundException {
       //open file
        Scanner scFile = new Scanner(new File("src/main/java/PersonObject/people.txt"));

        //scan through file
        while (scFile.hasNext()) {
            String line = scFile.nextLine();
            Scanner scLine = new Scanner(line);
            scLine.useDelimiter("#");
            int inID = Integer.parseInt(scLine.next());
            String inFirstName = scLine.next();
            String inSurname = scLine.next();
            double inWeight = Double.parseDouble(scLine.next());
            double inHeight = Double.parseDouble(scLine.next());

            Person p = new Person(inID, inFirstName, inSurname, inWeight, inHeight);
            
            double avgHeight = getAverageHeight();
            double avgWeight = getAverageWeight();
            
            return (avgWeight / (avgHeight * avgHeight));

        }
        return 0;
    }
}

      



