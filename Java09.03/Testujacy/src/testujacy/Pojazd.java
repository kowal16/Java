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
abstract class Pojzad {

    int miejsce, kola;
    double cena, waga;

    void ustawIloscMiejsc(int my_miejsca) {
        miejsce = my_miejsca;
    }

    void ustawiIloscKol(int my_kola) {
        kola = my_kola;
    }

    void ustawCenę(double my_cena) {
        cena = my_cena;
    }

    void ustawWagę(double my_waga) {
        waga = my_waga;
    }

    abstract boolean czyToWieloslad();

    abstract boolean czyMaDach();

    abstract boolean czyUtonie();

    public String toString() {
        return "Czy ma dach: " + czyMaDach() + " Czy to wieloslad: " + czyToWieloslad() + " Czy utonie: " + czyUtonie();
    }
}
