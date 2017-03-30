/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zawartosckatalogu;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author student
 */
public class ZawartoscKatalogu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File plik = new File(".");
        FilenameFilter fileNamFilter = new FilenameFilter() {
            @Override
            public boolean accept(File file, String string) {

                File dir = new File(file, string);
                if (dir.isDirectory()) {
                    return true;
                }
                return !dir.canExecute();
            }
        };

        File[] tablica_plikow = plik.listFiles(fileNamFilter);

        for (File ff : tablica_plikow) {
            if (ff.isDirectory()) {
                System.out.println("Katalog: " + ff + "\t" + ff.length() + " "
                        + new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date(ff.lastModified())));
            } else {
                System.out.println(ff + "\t" + ff.length() + " " + ff.lastModified());
            }
        }
    }

}
