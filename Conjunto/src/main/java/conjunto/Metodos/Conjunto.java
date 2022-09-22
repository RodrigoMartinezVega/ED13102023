/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjunto.Metodos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Emiliano
 * @param <T>
 */
public class Conjunto<T> implements Iterable<T>{
    ArrayList<T> datos = new ArrayList<>();

    public Conjunto() {
    }

    public int length() {
        return datos.size();
    }

    public boolean contains(T value) {
        return datos.indexOf(value) != -1;
    }

    public void add(T value) {
        if(!contains(value)) {
            datos.add(value);
        }
    }

    public void remove(T value) {
        datos.remove(value);
    }

    public boolean equals(Conjunto<T> other) {
        if(length() != other.length()) {
            return false;
        }
        for(int i = 0; i < length(); i++) {
            if(!other.contains(datos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isSubset(Conjunto<T> other) {
        if(length() > other.length()){
            return false;
        }
        for(int i = 0; i < length(); i++) {
            if(!other.contains(datos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void union(Conjunto<T> other) {
        for(int i = 0; i < other.length(); i++) {
            add(other.datos.get(i));
        }
    }

    public Conjunto<T> intersection(Conjunto<T> other) {
        Conjunto<T> result = new Conjunto();
        for(int i = 0; i < length(); i++) {
            if(other.contains(datos.get(i))) {
                result.add(datos.get(i));
            }
        }
        return result;
    }

    public Conjunto<T> difference(Conjunto<T> other) {
        Conjunto<T> result = new Conjunto();
        for(int i = 0; i < length(); i++) {
            if(!other.contains(datos.get(i))) {
                result.add(datos.get(i));
            }
        }
        for(int i = 0; i < other.length(); i++) {
            if(!contains(other.datos.get(i))) {
                result.add(other.datos.get(i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return datos.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < datos.size();
            }

            @Override
            public T next() {
                return datos.get(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

   
}
    

