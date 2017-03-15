package figura;

public class Figura {

    public double Pole;
    public double Obwod;
    public double Wymiar;
    public String Nazwa;
    int Liczba = 0;
    
    public Figura()
    {
        Pole = 0;
        Obwod = 0;
        Wymiar = 0;
        Nazwa = "";      
    }

    Figura(double d) {
        Wymiar = d;
    }

   
    void ustawLicznik(int MyLiczba){
        Liczba = MyLiczba;
    }
    
    void wypiszLicznik(){
        System.out.println(Liczba);
    }
    
    void wypisz()
    {
        System.out.println(Nazwa + " Pole: " + Pole + " Obwod: " + Obwod);
    }
    
    void ustaw(double MyPole, double MyObwod)
    {
        Pole = MyPole ;
        Obwod = MyObwod;
    }
    
    void ustaw(double MyWymiar)
    {
        Wymiar = MyWymiar;
    }
    
    void ustaw(String MyNazwa)
    {
        Nazwa = MyNazwa;
    }
    
    void ustaw(float MyPole, boolean MyObwod){
        Pole = MyPole;
        MyObwod = true;
        if(Obwod > 2){
            System.out.println(MyObwod);
        }
    }
    
    boolean czyPunktJestWewnątrz(double x, double y)
    {
        return Math.pow(x,2) + Math.pow(y,2) <=Math.pow(Wymiar,2);
    }
        
    @Override
        public String toString()
        {
            if(Pole > 0 && Obwod > 0)
                return Nazwa + " Pole: " + Pole + " Obwod: " + Obwod + " Licznik: " + Liczba;
            return "Blad";
        
        }
    
    public static void main(String[] args) {
        Figura Kolo = new Figura();
        Kolo.Nazwa = "Kolo";
        Kolo.ustawLicznik(6);
        //Kolo.wypiszLicznik();
        Kolo.ustaw(6.0,6.0);
        Kolo.ustaw(1.0);
        //Kolo.Obwod = (2 * Math.PI);
        //Kolo.Pole = (Math.PI * 2 * 2);
        //Kolo.wypisz();
        System.out.println(Kolo);
        
        Figura Kwadrat = new Figura();
        Kwadrat.Nazwa = "Kwadrat";
        Kwadrat.ustawLicznik(16);
       // Kwadrat.wypiszLicznik();
        Kwadrat.ustaw(6, 6);
        //Kwadrat.Obwod = (4 * 2);
        //Kwadrat.Pole = (2 * 2);
        //Kwadrat.wypisz();
        System.out.println(Kwadrat);
        
        double ile = 0;
        double x,y;
        for(int i = 0; i <=1000; i++){
            x = (int)(Math.random() * 2);
            y = (int)(Math.random() * 2);
            //System.out.println(x + " " + y);
            if(Kolo.czyPunktJestWewnątrz(x, y) == true){
                ile+=1;
            }
        }
        System.out.println((ile*4)/1000);
    }
}