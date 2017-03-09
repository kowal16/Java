/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * Stworzyć klasę Figura zawierającą pola: obwod_figury, pole_figury, metody wyświetlające
powyższe wartości oraz pusty konstruktor domyślny.
 * 
 */
class Figura{
    Double obwod_figury, pole_figury, wymiar;
    //kostruktor
    Boolean czyPunktJestWewnątrz(int x, int y){
       if(Math.pow(x, 2)+Math.pow(y, 2)<=Math.pow(wymiar, 2))
        return true;
       return false;
    }
    
    String informacja = "Figura";
    void wypiszObwod(){
        System.out.println("Obwod " + obwod_figury);
    }
    void wypiszPole(){
        System.out.println("Pole " + pole_figury);
    }
    @Override
    public String toString(){
        return informacja;
    }
    void wypisz(){
        System.out.println(this);
    }
    void powieksz(int a){}
    
}
//class MonteCarlo{
  // Figura test1 = new Figura(1.0);
    //public static void main(String[] args) {}
//}
/**
 * 
 * Stworzyć klasy potomne Kolo i Kwadrat zawierające dodatkowo odpowiednie pola,
konstruktory ustawiające wartości wszystkich dodatkowych pól oraz metody obliczające pole
i obwód danej figury.
 * 
 */
class Kolo extends Figura{
    Double promien;
    
    Kolo(Double myPromien){
        promien = myPromien;
        informacja += " " + promien; 
    }
    @Override
    void powieksz(int a){
        promien *= a; 
        obliczObwod();
        obliczPole();
    }
    Double obliczPole(){
        pole_figury = Math.PI * promien * promien;
       return pole_figury;
   }
    Double obliczObwod(){
        obwod_figury = 2 * Math.PI * promien;
       return obwod_figury;
   }
}

class Kwadrat extends Figura{
    Double bok;
    Kwadrat(Double myBok){
        bok = myBok;
        informacja += " " + bok;
    }
    @Override
    void powieksz(int a){
        bok *= a;
        obliczObwod();
        obliczPole();
    }
    Double obliczPole(){
        pole_figury = bok * bok;
       return pole_figury;
   }
    Double obliczObwod(){
        obwod_figury = 4 * bok;
       return obwod_figury;
   }
}
/**
 * Stworzyć klasę potomną klasy Kwadrat o nazwie Prostokat i utworzyć dodatkowe pola,
przesłonić metody obliczające pole i obwód figury.
 */
class Prostokat extends Kwadrat{
    Double drugiBok;

    Prostokat(Double drugiBok, Double myBok) {
        super(myBok);
        this.drugiBok = drugiBok;
        informacja += " " + drugiBok;
    }
    @Override
    void powieksz(int a){
        super.powieksz(a);
        drugiBok *= a;
        obliczObwod();
        obliczPole();
    }
    
    @Override
    Double obliczPole(){
        pole_figury = bok * drugiBok;
       return pole_figury;
   }
    @Override
    Double obliczObwod(){
        obwod_figury = 2 * bok + 2 * drugiBok;
       return obwod_figury;
   }
}
/**
 * Stwórz klasę Operacje zawierającą statyczną metodę powieksz_oblicz_wypisz(Figura f, int
   Metoda ta ma wywołać odpowiednie metody przekazanej jako parametr figury.
 * 
 */
class Operacje{
    void powieksz_oblicz_wypisz(Figura f, int a){
        f.powieksz(a);
        f.wypiszPole();
        f.wypiszObwod();
    }
}


public class JavaApplication1 {
    public static void main(String[] args) {
        Prostokat obiektProstokatny = new Prostokat(2.0, 3.0);
        Kolo obiektKolo = new Kolo(4.0);
        Kwadrat obiektKwa = new Kwadrat(5.0);
        Operacje test = new Operacje();
        //System.out.println(obiektProstokatny.obliczPole() + " " + obiektProstokatny.obliczObwod());
        //System.out.println(obiektProstokatny);
        //obiektProstokatny.wypisz();
        System.out.println("Prostokat");
        test.powieksz_oblicz_wypisz(obiektProstokatny, 2);
        System.out.println("Kolo");
        test.powieksz_oblicz_wypisz(obiektKolo, 1);
        System.out.println("Kwadrat");
        test.powieksz_oblicz_wypisz(obiektKwa, 2);
    }
    
}
