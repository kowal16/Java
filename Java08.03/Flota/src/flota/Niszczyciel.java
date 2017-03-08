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
public class Niszczyciel extends Okret {

    int silaRazenia, iloscDzial;

    public Niszczyciel(double my_bok1, double my_bok2, int my_silaRazenia, int my_iloscDzial) {
        super(my_bok1, my_bok2);
        silaRazenia = my_silaRazenia;
        iloscDzial = my_iloscDzial;
    }

    public Niszczyciel(double my_bok1, double my_bok2, int my_liczbaPasazerow, int my_wypornosc, int my_unikalnyNumer, int my_silaRazenia, int my_iloscDzial) {
        super(my_bok1, my_bok2, my_liczbaPasazerow, my_wypornosc, my_unikalnyNumer);
        iloscDzial = my_iloscDzial;
        silaRazenia = my_silaRazenia;
    }

}
