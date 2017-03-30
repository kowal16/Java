/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odzczytajbinarnie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class OdzczytajBinarnie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        try {
            RandomAccessFile odczyt = new RandomAccessFile("C:\\Users\\student\\Desktop\\Java30.03\\ ZapiszBinarnie\\plik.txt", "rw");
            odczyt.seek(0);
            int tmpNN = ((odczyt.readInt() - 1) * 8) + 4;
            
            odczyt.seek(tmpNN);
            System.out.println(odczyt.readDouble());
           
            int tmpSR = (int) (odczyt.length() - 8);
           
            odczyt.seek(tmpSR);
            System.out.println(odczyt.readDouble());
            
            odczyt.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OdzczytajBinarnie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
