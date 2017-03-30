/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;


public class Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestMojegoWyjatku obTMW = new TestMojegoWyjatku();
        try{
        obTMW.test();
        }catch(MojException e){
            System.out.println(e);
        }finally{
            System.out.println("1/"+obTMW.wartosc);
        }        
    }
    
}
