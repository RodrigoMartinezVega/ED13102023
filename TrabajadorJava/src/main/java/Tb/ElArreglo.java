/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tb;

import java.util.Arrays;

/**
 *
 * @author Emiliano
 */
public class ElArreglo<T> implements Iterable<T> {

    private T[] info;
    private int tam;

    public ElArreglo(int tamaño) {
        this.tam = tamaño;
        info = (T[]) new Object[tamaño];
    }

    public T getItem(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice >= this.tam || indice < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index, out of bounds");
        }
        return info[indice];
    }

    public void setItem(int indice, T valor) throws ArrayIndexOutOfBoundsException {
        if (indice >= this.tam || indice < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index, out of bounds");
        }
        info[indice] = valor;
    }

    public int getLength() {
        return this.tam;
    }

    public void clear(T valor) {
        for (int i = 0; i < tam; i++) {
            info[i] = valor;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(info);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int indice = 0;

            @Override
            public boolean hasNext() {
                return indice < tam;
            }

            @Override
            public T next() {
                return info[indice++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
