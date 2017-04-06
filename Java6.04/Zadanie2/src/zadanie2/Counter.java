
package zadanie2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Counter implements Runnable{

    int identyfikator;

    Counter(int my_identyfikator) {
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
