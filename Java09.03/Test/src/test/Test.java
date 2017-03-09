/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int[] sred = new int[a];
        for(int i= 1; i<=a ; i++){
            sred[i-1]=Integer.parseInt(args[i]);
        }
        SredniaArytmetyczna sa = new SredniaArytmetyczna();
        System.out.println(sa.obliczSrednia(sred));
        SredniaGeometryczna sg = new SredniaGeometryczna();
        System.out.println(sa.obliczSrednia(sred));
        
    }
    
}
