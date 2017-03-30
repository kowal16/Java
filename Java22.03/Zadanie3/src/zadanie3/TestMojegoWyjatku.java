/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author student
 */
public class TestMojegoWyjatku {
    int wartosc;
    void test() throws MojException {
        wartosc = ThreadLocalRandom.current().nextInt(1,5);
        if(wartosc==2){
        throw new MojException("Testowy");
        }
        throw new MojException("MW" );
    }
}


