/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapiszbinarnie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ZapiszBinarnie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int N =3;
        double N1 = 1.0;
        double N2 = 2.0;
        double N3 = 3.0;
        double SR = (N1 + N2 + N3) / N;
        String ST = "Java dla NSI12345";
        

        try {
            RandomAccessFile zapis = new RandomAccessFile("plik.txt", "rw");
            zapis.writeInt(N);
            zapis.writeDouble(N1);
            zapis.writeDouble(N2);
            zapis.writeDouble(N3);
            zapis.writeUTF(ST);
            zapis.writeDouble(SR);
            zapis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZapiszBinarnie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
