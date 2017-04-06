package zadanie2;

public abstract class Zadanie2 {

    public static void main(String[] args) throws InterruptedException {
        (new Thread(new Counter(1))).start();
        (new Thread(new Counter(2))).start();
        (new Thread(new Counter(3))).start();
        
        (new Thread(new Counter(3))).join();
        System.err.println("Koniec");

    }

}
