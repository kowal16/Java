/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

/**
 *
 * @author student
 */
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Start");      
        (new Thread(new Producent())).start();
        (new Thread(new Konsument())).start();
        
                
    }
    
}
