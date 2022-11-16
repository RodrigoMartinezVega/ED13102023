/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.ArrayList;

/**
 *
 * @author Emiliano
 *
 */
public class PilasADT {

    public ArrayList<Integer> pila;
    int tope;

    public PilasADT(ArrayList<Integer> pila, int tope) {
        this.pila = pila;
        this.tope = tope;
    }

    public PilasADT() {
        pila = new ArrayList<>();
        tope = -1;
    }

    public ArrayList<Integer> isFull() {

        if (pila.size() >= 5) {
            System.out.println("La pila esta llena");
            for (int i = 4; i < pila.size(); i++) {
                pila.get(i);
                pila.remove(i);
                i--;
                ;
            }
        } else {
            System.out.println("No esta llena");
        }
        return pila;
    }

    public void Push(int i) {
        pila.add(i);
        tope++;
    }

    public int Pop() {
        int c;
        if (isEmpty()) {
            System.out.println("Esta vacia");
            return -1;
        } else {
            c = pila.get(tope);
            pila.remove(tope);
            tope--;
            return c;
        }

    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public int Lenght() {
        return pila.size();
    }

    public int Peek() {
        Integer b;
        if (isEmpty()) {
            System.out.println("Pila Vacia");
            return -1;
        } else {
            b = pila.get(tope);
            return b;
        }
    }

    @Override
    public String toString() {
        return "Pila: " + pila;
    }

}
