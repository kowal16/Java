package zadanie1;

public class LapanieWyjatkow extends Throwable {

    void podziel(int[] tab) throws Throwable {
        try {

            for (int i = 0; i <= tab.length - 1; i++) {
                try {
                    tab[i] = tab[i] / tab[i + 1];
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wyjatek " + e +" "+ e.getStackTrace());
                    try {
                        tab[i] = tab[i] / tab[0];
                    } catch (ArithmeticException ex) {
                        System.out.println("Wyjatek " +ex +" "+ ex.getStackTrace());
                        tab[i] = 0;
                      throw ex;
                    }
                }
            }
        } catch (NullPointerException exe) {
            System.out.println("Wyjatek " +exe+" "+ exe.getStackTrace());
            throw exe;
        }

    }
}
