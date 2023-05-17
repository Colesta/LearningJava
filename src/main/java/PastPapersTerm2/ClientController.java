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
public class ClientController {
      private Client[] clients;
      private int size;
      private static final String FILE_NAME = "data/client.txt";
      
      
    public ClientController(){
        clients = new Client [100];
        size = 0;
        
          try {
              Scanner sc = new Scanner (new File(FILE_NAME)).useDelimiter("#");
              while(sc.hasNext()){
                  
              sc.nextLine();
              String name = sc.next();
              String email = sc.next();
              String password = sc.next();
              String tierStr = sc.next();
              int
                      usuage = sc.nextInt();
              
              int tier = 0;
              if (tierStr.equals("bronze")){
                      tier = Client.BRONZE_TIER;
                  } else if (tierStr.equals("sliver")) {
                      tier = Client.SILVER_TIER;
                  } else if (tierStr.equals("gold")) {
                      tier = Client.GOLD_TIER;
                  }
              
              Client nextClient = new Client(name, email, password, tierStr, usuage);
              clients[size] = nextClient;
              size ++;

              }
              
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("FILE DOES NOT EXIST");
          }
          
    }
      @Override
    public String toString(){
        String out = "";
        for (int i = 0; i < size; i++) {
            out += clients[i];
            out += "\n";
        }
      return out;
    }
    
    public void sort(){
        
    }
    
    public Client search(String surname){
        for (int i = 0; i < size; i++) {
            if(surname.equals(clients[i].getSurname())){
                return clients[i];
            }
        }
        return null;
    }
    
    
}
