/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

class Klasa
{
	public int mojePole;
	Integer pInt;
	public double poleDouble;
	
	public Klasa(int mojePole, Integer pInt, double poleDouble)
	{
		mojePole=mojePole;
		pInt=pInt;
		poleDouble=poleDouble;
	}
}


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Klasa kk = new Klasa(1,2,3.0);
    }

}
