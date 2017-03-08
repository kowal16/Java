/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota;

/**
 *
 * @author student
 */
public class Okret {

    double bok1, bok2;
    int liczbaPasazerow, wyporniosc, unikalnyNumer;

    public Okret() {
    }

    ;
    public Okret(double my_bok1, double my_bok2) {
        bok1 = my_bok1;
        bok2 = my_bok2;
    }

    public Okret(double my_bok1, double my_bok2, int my_liczbaPasazerow, int my_wypornosc, int my_unikalnyNumer) {
        bok1 = my_bok1;
        bok2 = my_bok2;
        liczbaPasazerow = my_liczbaPasazerow;
        wyporniosc = my_wypornosc;
        unikalnyNumer = my_unikalnyNumer;
    }

    double polePow() {
        return bok1 * bok2;
    }

}
