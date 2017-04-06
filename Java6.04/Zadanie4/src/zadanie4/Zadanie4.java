/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie4;

/**
 *
 * @author student
 */
public class Zadanie4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pisarz watek = new Pisarz("123");
        Watek watek1 = new Watek(watek,"345");
        Watek watek2 = new Watek(watek,"678");
        watek.wypisz();
        watek1.wypisz();
        
    }
    
}
