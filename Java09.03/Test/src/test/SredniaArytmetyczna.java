/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author student
 */
public class SredniaArytmetyczna implements Srednia {

    
    public double obliczSrednia(int sred[]) {
        double wynik = 0.0;
        for (int i = 0;i < sred.length; i++) {
                wynik += sred[i];
        }
        return wynik/sred.length;
    }

}
