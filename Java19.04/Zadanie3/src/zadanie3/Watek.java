/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

/**
 *
 * @author student
 */
public class Watek extends Thread {

    boolean wygrana = false;

    @Override
    public synchronized void run() {
        while (true) {
            int liczba = (int) (Math.random() * 101);
            System.out.println(liczba);
            
            if (liczba > 70) {
                wygrana = true;
                System.out.println("Wygrałem");
            }
            if (wygrana) {
                
                System.out.println("Przegralem");
            }
            break;
        }

    }
}


