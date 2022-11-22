/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colascpac;

/**
 *
 * @author Emiliano
 */
import java.util.PriorityQueue;
import java.util.Queue;


public class Main{
    public static void main(String[] args) {
        Queue<Persona> cola = new PriorityQueue<Persona>();

        cola.add(new Persona("Cristiano", 3));
        cola.add(new Persona("Messi", 3));
        cola.add(new Persona("Neymar JR", 2));
        cola.add(new Persona("Ochoa", 1));

        while (!cola.isEmpty()) {
            Persona a = cola.remove();
            System.out.println(a.getNombre() + " " + a.getTipo());
        }

    }   
}
 
     
