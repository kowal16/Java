/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author student
 */
public class Figura {

    double Pole;
    double Obwod;
    double Wymiar;
    String Nazwa;

    /**
     *
     */
    public Figura() {
        Pole = 0;
        Obwod = 0;
        Wymiar = 0;
        Nazwa = " ";
    }

    void wypisz() {
        System.out.println(Nazwa + " " + "Pole " + Pole + " " + "Obwod " + Obwod);
    }

    void ustaw(double myPole, double myObwod) {
        Pole = myPole;
        Obwod = myObwod;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        if (Pole > 0 && Obwod > 0) {
            return Nazwa + " " + Pole + " " + Obwod;
        }
        return "Nie";
    }

    void ustaw(double myWymiar) {
        Wymiar = myWymiar;
    }

    void ustaw(String myNazwa) {
        Nazwa = myNazwa;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura Kolo = new Figura();
        Kolo.Nazwa = "Kolo";
        Kolo.Obwod = (2 * Math.PI);
        Kolo.Pole = (Math.PI * 2 * 2);
        Kolo.wypisz();
        System.out.println(Kolo);

        Figura Kwadrat = new Figura();
        Kwadrat.Nazwa = "Kwadrat";
        Kwadrat.ustaw(3.0, 6.5);
        System.out.println(Kwadrat);

    }
}
