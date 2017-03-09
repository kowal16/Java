/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testujacy;

/**
 *
 * @author student
 */
public class Testujacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Samochod s = new Samochod();
        Rower r = new Rower();
        Lodz l = new Lodz();
        
        System.out.println("Samochod:");
        System.out.println("Czy ma dach: " + s.czyMaDach());
        System.out.println("Czy to wieloslad: "  + s.czyToWieloslad());
        System.out.println("Czy utonie: " + s.czyUtonie());
        
        
        System.out.println("Rower:");
        System.out.println("Czy ma dach: " + r.czyMaDach());
        System.out.println("Czy to wieloslad: "  + r.czyToWieloslad());
        System.out.println("Czy utonie: " + r.czyUtonie());
        
        System.out.println("Lodz:");
        System.out.println("Czy ma dach: " + l.czyMaDach());
        System.out.println("Czy to wieloslad: "  + l.czyToWieloslad());
        System.out.println("Czy utonie: " + l.czyUtonie());
        System.out.println(s);
        System.out.println(r);
        System.out.println(l);
    
}
}
