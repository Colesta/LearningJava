/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastPapersTerm2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author colep
 */
public class Client {
    
    private String fullname;
    private String email;
    private String password;
    private int clientTier;
    private int currentUsuage;
    
    public  static final int BRONZE_TIER = 0;
    public static final int SILVER_TIER = 1;
    public static final int GOLD_TIER = 2;
   
    public Client(String fn, String e, String p, String cT, int cU){
     fullname = fn;
     email = e;
     password = p;
     currentUsuage = cU;
     
     if (cT == "bronze"){
         clientTier = 0;
     }else if (cT == "sliver"){
         clientTier = 1;
     }else if (cT == "gold"){
         clientTier = 2;
     }
        
}
     
    public String getSurname(){
        
        return fullname.substring(fullname.lastIndexOf(" "));
    }
    
    public  double calculateCurrentBill(){
        double Totcost = 0.0;
        
        switch (clientTier) {
            case Client.BRONZE_TIER:
                Totcost = 100 + this.currentUsuage * 0.80;
                break;
                
            case Client.SILVER_TIER:
                if (this.currentUsuage <= 300){
                 Totcost = 180;
                }else{
                 Totcost = 180 + (this.currentUsuage - 300) * 0.75;  
                }
                break;
                
            case Client.GOLD_TIER:
                if(this.currentUsuage <= 1000){
                    Totcost = 350;
                }else{
                    Totcost = 350 + (this.currentUsuage - 1000) * 0.68;  
                }
               
                break;
        }
        
        
        return Totcost;
   }
    
    public boolean isSecure(){
        boolean complex = false;
        boolean charEight = false;
        boolean upper = false;
        boolean lower = false;
        boolean num = false;
        
        if(this.password.length() >= 8){
            charEight = true;
        }
        
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(this.password.charAt(i))){
                upper = true;
            } else if(Character.isLowerCase(this.password.charAt(i))){
                lower = true;
            } else if(Character.isDigit(this.password.charAt(i))){
                num = true;
            }
            
        }
        
        if(charEight && upper && lower && num){
            complex = true;
        }
       
        
     return complex;                
    }

    @Override
    public String toString(){
        String tier = "";
        switch(clientTier){
            case 0:
                tier = "bronze";
                break;
            case 1:
                tier = "silver";
                break;
            case 2:
                tier = "gold";
                break;
        }
        
        
        return ("USER: " + this.fullname + "\n" +
                "ACCOUNT TIER: " + tier + "\n" +
                "CURRENT ACCOUNT: " + this.currentUsuage + "@R" + this.calculateCurrentBill() + "\n" +
                "SECURE: " + this.isSecure());
    }
    
    
}
