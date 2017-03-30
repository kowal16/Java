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
     * @throws java.lang.Throwable
     */
    public static void main(String[] args) throws Throwable {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        LapanieWyjatkow test = new LapanieWyjatkow();
        try{
        test.podziel(tab);
        }catch(Throwable e){
            System.out.println("Wyjatek " + e);
        }

    }

}
