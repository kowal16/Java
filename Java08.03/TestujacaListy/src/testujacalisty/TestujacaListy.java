/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testujacalisty;

/**
 *
 * @author student
 */
public class TestujacaListy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stos s1;
        s1 = new Stos();
        Kolejka k1;
        k1 = new Kolejka();

        s1.czy_pusty();
        s1.wstaw(1);
        s1.wstaw(3);
        s1.wstaw(2);
        s1.wstaw(4);
        s1.wstaw(9);
        s1.czy_pusty();
        s1.pobierz();
        s1.pobierz();
        s1.czy_pusty();
        System.out.println(s1);

        k1.czy_pusty();
        k1.wstaw("1");
        k1.wstaw("4");
        k1.wstaw("tak");
        k1.czy_pusty();
        k1.pobierz();
        k1.pobierz();
        System.out.println(k1);
    }

}
