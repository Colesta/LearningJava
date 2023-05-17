/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastPapersTerm2;

/**
 *
 * @author colep
 */
public class ClientUi {
    
    public static void main(String[] args) {
        ClientController cc = new ClientController();
        Client c = new Client("John Manning","jman@gmail.com", "H3llomom", "bronze", 1500);
        System.out.println(cc.toString());
    }
    
    
}
