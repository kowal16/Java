/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopiujpoznaku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author student
 */
public class KopiujPoZnaku {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream inStream = null;
        OutputStream outStream = null;
        
        FileOutputStream fop = null;
        File plik;
        String test = ""
                + "                               _..----.._                                   \n" +
"                                                    ]_.--._____[                                  \n" +
"                                                  ___|'--'__..|--._                               \n" +
"                              __               \"\"\"    ;            :                              \n" +
"                            ()_ \"\"\"\"---...__.'\"\"!\":  /    ___       :                             \n" +
"                               \"\"\"---...__\\]..__] | /    [ 0 ]      :                             \n" +
"                                          \"\"\"!--./ /      \"\"\"        :                            \n" +
"                                   __  ...._____;\"\"'.__________..--..:_                           \n" +
"                                  /  !\"''''''!''''''''''|''''/' ' ' ' \\\"--..__  __..              \n" +
"                                 /  /.--.    |          |  .'          \\' ' '.\"\"--.{'.            \n" +
"             _...__            >=7 //.-.:    |          |.'             \\ ._.__  ' '\"\"'.          \n" +
"          .-' /    \"\"\"\"----..../ \"\">==7-.....:______    |                \\| |  \"\";.;-\"> \\         \n" +
"          \"\"\"\";           __..\"   .--\"/\"\"\"\"\"----....\"\"\"\"\"----.....H_______\\_!....'----\"\"\"\"]       \n" +
"        _..---|._ __..--\"\"       _!.-=_.            \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"                   ;\"\"\"        \n" +
"       /   .-\";-.'--...___     .\" .-\"\"; ';\"\"-\"\"-...^..__...-v.^___,  ,__v.__..--^\"--\"\"-v.^v,      \n" +
"      ;   ;   |'.         \"\"\"-/ ./;  ;   ;\\P.        ;   ;        \"\"\"\"____;  ;.--\"\"\"\"// '\"\"<,     \n" +
"      ;   ;   | 1            ;  ;  '.: .'  ;<   ___.-'._.'------\"\"\"\"\"\"____'..'.--\"\"\";;'  o ';     \n" +
"      '.   \\__:/__           ;  ;--\"\"()_   ;'  /___ .-\" ____---\"\"\"\"\"\"\" __.._ __._   '>.,  ,/;     \n" +
"        \\   \\    /\"\"\"<--...__;  '_.-'/; \"\"; ;.'.'  \"-..'    \"-.      /\"/    `__. '.   \"---\";      \n" +
"         '.  'v ; ;     ;;    \\  \\ .'  \\ ; ////    _.-\" \"-._   ;    : ;   .-'__ '. ;   .^\".'      \n" +
"           '.  '; '.   .'/     '. `-.__.' /;;;   .o__.---.__o. ;    : ;   '\"\";;\"\"' ;v^\" .^        \n" +
"             '-. '-.___.'<__v.^,v'.  '-.-' ;|:   '    :      ` ;v^v^'.'.    .;'.__/_..-'          \n" +
"                '-...__.___...---\"\"'-.   '-'.;\\     'WW\\     .'_____..>.\"^\"-\"\"\"\"\"\"\"\"    fsc       \n" +
"                                      '--..__ '\"._..'  '\"-;;\"\"\"                                   \n" +
"                                             \"\"\"---'\"\"\"\"\"\"                                        \n" +
"                                                                                                ";
       
        try {
            plik = new File("C:\\Users\\student\\Desktop\\Java29.03\\KopiujPoZnaku\\kopia\\aplik.txt");
            fop = new FileOutputStream(plik);

            byte[] testInBytes = test.getBytes();
            fop.write(testInBytes);
            fop.flush();
            fop.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     

        try {
            File aplik = new File("C:\\Users\\student\\Desktop\\Java29.03\\KopiujPoZnaku\\kopia\\aplik.txt");
            File bplik = new File("C:\\Users\\student\\Desktop\\Java29.03\\KopiujPoZnaku\\kopia\\bplik.txt");
            
            inStream = new FileInputStream(aplik);
            outStream = new FileOutputStream(bplik);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            inStream.close();
            outStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
