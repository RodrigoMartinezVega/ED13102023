import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un nuevo TreeMap
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		//Colocar un valor a cada key
		tm.put(78, "Mexicano");
		tm.put(12,"Hola");
		tm.put(34, "yo");
		tm.put(48, "soy");
		tm.put(36,"y");
		tm.put(15, "soy");
		
		
		//Devuelve la primera key
		System.out.println("Primer key: " +tm.firstKey());
		//Devuelve la ultima key/valor 
		System.out.println("Ultimo entry: " +tm.lastEntry());
		//Remplaza el valor antiguo en una clave en especifico
		tm.replace(34, "yo", "Rodrigo");
		
		// Imprimimos el Map con un Iterador 
		//Se utiliza keySet() para obtener una vista del conjunto de keys
		Iterator<Integer> it = tm.keySet().iterator();//
		while(it.hasNext()){
		  Integer key = it.next();
		  //Devuelve cada clave junto con su valor en caso de que la iteración tenga todavia elementos
		  System.out.println("Clave: " + key + " -> Valor: " + tm.get(key));
		}
		
		System.out.println("Borrando todos los elementos...");
		//Elimina todos los registros del map
		tm.clear();
		//Evalua si el TreeMap esta vacio
				System.out.println("Esta vacio?: " +tm.isEmpty());
		
	}

}
