/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
  interface Counter {

        public void run();

    }
public class Anonim implements Counter{
   
            int identyfikator;

    Anonim(int my_identyfikator) {
        identyfikator = my_identyfikator;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(identyfikator + " " + i);
            int t = (int) (Math.random() * 101);
            try {
                // System.out.println(t);
                sleep(t);
            } catch (InterruptedException ex) {
                Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

  
    

}
