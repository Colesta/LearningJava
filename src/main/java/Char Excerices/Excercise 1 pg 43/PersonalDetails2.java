// The "PersonalDetails2" class.
import javax.swing.*;
public class PersonalDetails2{
   public static void main(String [] args){
   
   String name;
   String surname;
   String telnum;
   String yearOfBirth;
   String height;
   
   name = JOptionPane.showInputDialog ("First name?");
   surname = JOptionPane.showInputDialog ("Surname?");
   telnum = JOptionPane.showInputDialog ("Cell number?");
   yearOfBirth = JOptionPane.showInputDialog ("Year of birth YYYY ?") ;
   
   height = JOptionPane.showInputDialog ("Height in metres (with 1 dec. pl.) " );
   
   JOptionPane.showMessageDialog (null, "NAME:" +name + " " + surname + "\nYEAR OF BIRTH: " + yearOfBirth + "\nHEIGHT (m): " + height + "\nTELEPHONE NUMBER: " + telnum , "PERSONAL DETAILS" , JOptionPane.PLAIN_MESSAGE);
   
   
      
   }
}