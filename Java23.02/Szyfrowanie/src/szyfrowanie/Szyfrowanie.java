/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szyfrowanie;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Szyfrowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        String linia = odczyt.nextLine();
        
        for(int i=0;i<linia.length();i++) {
            char wynik = linia.charAt(i);
            int znak = (int)wynik;
            String binar = Integer.toBinaryString(znak);
            char[] tab=binar.toCharArray();
            System.out.println(tab);
            char tmp = tab[3];
            tab[3]=tab[4];
            tab[4]=tmp;
            tmp=tab[5];
            tab[5]=tab[6];
            tab[6]=tmp;
            String tab1 = new String(tab);
            System.out.println(tab1);
            
           
        }
        
    }

}
