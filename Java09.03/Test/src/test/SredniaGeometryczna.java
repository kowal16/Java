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
public class SredniaGeometryczna implements Srednia {

    public double obliczSrednia(int sred[]) {
        double wynik = 0.0;
        for (double i = 0; i < sred.length; ++i) {
            wynik *= i;
        }
        return Math.pow(wynik, 1.0 / sred.length);
    }

}
