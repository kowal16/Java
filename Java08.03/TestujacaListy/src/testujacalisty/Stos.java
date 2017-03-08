/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testujacalisty;

import java.util.LinkedList;

/**
 *
 * @author student
 */
public class Stos extends LinkedList {

    void wstaw(Object element) {
        addLast(element);
    }

    Object pobierz() {
        return removeLast();
    }

    void czy_pusty() {
        if (isEmpty() == true) {
            System.out.println("Pusto");
        } else {
            System.out.println("Liczba Elementow " + size());
        }
    }
}
