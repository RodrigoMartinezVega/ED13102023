/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Scanner;

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
        int n,dato; 
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa el numero de elementos para la pila");
        n=in.nextInt();
        PilasADT p1= new PilasADT();
       
           for(int i=0;i<n;i++){
            System.out.println("Ingrese el valor");
            dato=in.nextInt();
             p1.Push(dato);
    }
        
        
        System.out.println("Is empty?: " + p1.isEmpty());
        System.out.println("Is full: "+ p1.isFull());
        System.out.println("Lenght: " + p1.Lenght() + " " + p1.toString());
        System.out.println("Peek: " + p1.Peek());
        System.out.println("Pop: " + p1.Pop() + " " + p1.toString());

        
        
    }
    
}
