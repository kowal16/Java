/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie4;

/**
 *
 * @author student
 */
public class Pisarz {
    String a;

    public Pisarz(String a) {
        this.a = a;
    }
    
    void wypisz(){
        for(int i = 0 ; i<=100;i++){
        System.out.println(a);
        }
    }
    
}
