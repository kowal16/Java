package zadanie1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {

    public static void main(String[] args) throws FileNotFoundException, IOException 
    {        
        FileInputStream plik = new FileInputStream(args[0]);
        DataInputStream dt = new DataInputStream(plik);
        BufferedReader br = new BufferedReader(new InputStreamReader(dt));
        String Contents = "";
        String str = "";
        while ((Contents = br.readLine()) != null) {
            str += Contents;
        }
        char[] char_array = str.toCharArray();
        int count = 0;
        char ch;
        Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            ch = char_array[i];
            if (charCounter.containsKey(ch)) {
                charCounter.put(ch, charCounter.get(ch) + 1);
            } else {
                charCounter.put(ch, 1);
            }
        }
        for (Character key : charCounter.keySet()) {
            if((((int)key>=65)&&((int)key<=90))||(((int)key>=97)&&((int)key<=122))){
            System.out.println(key + ": " + charCounter.get(key));
            }
        }
    }
}
