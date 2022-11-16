/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasadt;

/**
 *
 * @author Emiliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colas c = new Colas();

       //enqueue( elem ) -> Ingresa un elemento al final.
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(7);
        c.enqueue(12);
        c.enqueue(9);
        
        //dequeue() -> Saca el elemento que se encuentra el frente de la estructura.
        c.dequeue();
        
        System.out.println("Is empty?: " + c.isEmpty());
        c.length();
        System.out.println(c.toString());

    }

}
