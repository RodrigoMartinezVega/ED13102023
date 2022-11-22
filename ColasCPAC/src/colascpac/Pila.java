/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colascpac;

/**
 *
 * @author Emiliano
 */
public class Pila{
  
        Nodo inicio;
        Nodo fin;
        
        public Pila() {
            inicio =null;
        }
        
        public void enqueue(int dato){
        Nodo nuevo= new Nodo(dato);
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
        }
        
        public int dequeue(){
        Nodo aux=inicio;
        inicio=inicio.getSiguiente();
        aux.setSiguiente(null);
        return aux.getDato();
        }
        
        public boolean vacio(){
            if(inicio==null){
                System.out.println("Esta vacio");
                return true;
            }else{
                System.out.println("No esta vacio");
                return false;
            }
        }
        public int size(){
            Nodo aux = inicio;
            int count = 0;
            while(aux!=null){
                aux = aux.getSiguiente();            
                count++;
            }
            return count;
        }
        
        public int tope()throws Exception{
            
            if(!vacio()){
                int tope=inicio.getDato();
                return tope;
            }else{
                
                throw new Exception("La lista esta vacia");
            }
            
        }
        
        public void imprimir(){
            Nodo aux = inicio;
            
            while(aux!=null){
                System.out.println(aux.getDato());
                aux = aux.getSiguiente();            
                
            }
        }
        
    
}
