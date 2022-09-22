/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjunto.conjunto;
import conjunto.Metodos.Conjunto;
import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Emiliano
 */
public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> c1;
    c1= new ArrayList<>();
    c1.add(14); 
    c1.add(1);
    c1.add(88);
    c1.add(4);
    c1.add(24);
    c1.add(5);
    c1.add(47);
    c1.add(38);
    
    ArrayList<Integer> c2;
    c2= new ArrayList<>();
    c2.add(5);
    c2.add(4);
    c2.add(3);
    c2.add(38);
    c2.add(47);
    c2.add(23);
    c2.add(14);
    c2.add(2);
    c2.add(89);
    
    
        System.out.println("Longitud");
        System.out.println("c1= " +c1.size());
        System.out.println("c2= " +c2.size());
        
        System.out.println("Contiene");
        System.out.println("c1 contiene 10 "+c1.contains(10));
        System.out.println("c2 contiene 2 "+c2.contains(2));
        
        System.out.println("Agregar");
        System.out.println(c1.add(12));
        System.out.println(c1);
        System.out.println(c2.add(55));
        System.out.println(c2);
        
        System.out.println("Eliminar dato del conjunto");
        c1.remove(3);
        c2.remove(4);
        System.out.println(c1);
        System.out.println(c2);   
        
        System.out.println("Es igual");
        System.out.println(c1.equals(c2));
         
        System.out.println("Iterador");
        ArrayList <Integer> num= new ArrayList();
        Main it = (Main) num.iterator();
        while (it.hasNext()){
            System.out.println(it.next);
        }
   }
    private boolean next;

    private boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
