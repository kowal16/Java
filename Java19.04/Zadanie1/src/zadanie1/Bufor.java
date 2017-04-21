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
public class Bufor {

    String element= "nic";
    boolean czyPusty=true;

    

    void wstaw() throws Exception {
        if(czyPusty){
        element="Produkt";
        czyPusty=false;
        }else{
            throw new Exception("Pelno");
        }
    }

    String pobierz() throws Exception {
        if(czyPusty){
            throw new Exception("Pusty bufor");       
        }
        czyPusty=true;
        return element;    
       
    }

}
