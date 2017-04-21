/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Producent extends Bufor implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produkuje");
                wstaw();
                sleep(3);
            } catch (InterruptedException ex) {
               System.out.println(ex);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

}
