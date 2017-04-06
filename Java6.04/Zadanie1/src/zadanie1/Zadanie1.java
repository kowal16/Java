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
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Counter watek = new Counter(1);
        Counter watek1 = new Counter(2);
        Counter watek2 = new Counter(3);

        watek.start();
        watek1.start();
        watek2.start();

        watek2.join();

    }

}
