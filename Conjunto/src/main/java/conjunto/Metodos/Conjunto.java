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
public class Conjunto<T> implements Iterable<T> {

    ArrayList<T> datos = new ArrayList<>();

    public Conjunto() {
    }

    public int longitud() {
        return datos.size();
    }

    public boolean contiene(T valor) {
        return datos.indexOf(valor) != -1;
    }

    public void agregar(T valor) {
        if (!contiene(valor)) {
            datos.add(valor);
        }
    }

    public void eliminar(T valor) {
        datos.remove(valor);
    }

    public boolean igual(Conjunto<T> ot) {
        if (longitud() != ot.longitud()) {
            return false;
        }
        for (int i = 0; i < longitud(); i++) {
            if (!ot.contiene((datos.get(i)))) {
                return false;
            }
        }
        return true;
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
