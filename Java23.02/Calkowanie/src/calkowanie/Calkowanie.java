/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calkowanie;

/**
 *
 * @author student
 */
public class Calkowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x1 = Double.parseDouble(args[3]);
        double x2 = Double.parseDouble(args[4]);
        double calka;
        calka = ((1.0/3)*a*Math.pow(x2,3)+(1.0/2)*b*Math.pow(x2,2)+c*x2)-((1.0/3)*a*Math.pow(x1,3)+(1.0/2)*b*Math.pow(x1,2)+c*x1);
        System.out.println(calka);
    }
    
}
